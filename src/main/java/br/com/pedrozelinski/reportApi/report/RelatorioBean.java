package br.com.pedrozelinski.reportApi.report;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import br.com.pedrozelinski.reportApi.report.reports.Cape;
import br.com.pedrozelinski.reportApi.report.reports.Retest;
import br.com.pedrozelinski.reportApi.report.reports.Vulnerability;
import br.com.pedrozelinski.utils.Constants;
import br.com.pedrozelinski.utils.ReportBuilder;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;

public class RelatorioBean {

	/**
	 * 
	 * 
	 * @param joRelatorio
	 * @throws Exception 
	 */
	public static byte[] reportPdfBuilder(Vulnerability relatorio, String reportModel)
			throws Exception {
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		JRPdfExporter exporter = new JRPdfExporter();
		ArrayList<JasperPrint> jasperPrints = new ArrayList<JasperPrint>();
		Cape capa = new Cape(relatorio.getCliente(), relatorio.getProjeto());
		jasperPrints.add(ReportBuilder.buildReport(capa, Constants.CAPE_TEMPLATE));

		switch(reportModel){
			case "ponto":
				jasperPrints.add(ReportBuilder.buildReport(relatorio, Constants.VULNERABILITY_TEMPLATE));
				for (Retest reteste : relatorio.getRetestes())
					jasperPrints.add(ReportBuilder.buildReport(reteste, Constants.RETEST_TEMPLATE));
				break;
			case "reteste":
				if(relatorio.getRetestes().size() != 0)
					for (Retest reteste : relatorio.getRetestes()) {
						reteste.setLogo(relatorio.getLogo());
						jasperPrints.add(ReportBuilder.buildReport(reteste, Constants.RETEST_TEMPLATE));
					}
				else
					throw new Exception(Constants.RETEST_EMPTY_ERROR);
				break;
			case "projeto":
				for (Vulnerability apontamento : relatorio.getApontamentos()) {
					jasperPrints.add(ReportBuilder.buildReport(apontamento, Constants.VULNERABILITY_TEMPLATE));
					if (apontamento.getRetestes() != null)
						for (Retest reteste : apontamento.getRetestes()) {
							reteste.setLogo(relatorio.getLogo());
							jasperPrints.add(ReportBuilder.buildReport(reteste, Constants.RETEST_TEMPLATE));
						}
				}
				break;
		}
		
		exporter.setExporterInput(SimpleExporterInput.getInstance(jasperPrints));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputStream));
		SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
		exporter.setConfiguration(configuration);
		exporter.exportReport();

		return outputStream.toByteArray();
	}
}