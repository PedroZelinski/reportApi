package br.com.pedrozelinski.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.pedrozelinski.reportApi.report.reports.IReport;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;

public class ReportBuilder {
	
	
	public static JasperPrint buildReport(IReport report, String resource) throws Exception{
		ArrayList<JasperPrint> jasperPrints = new ArrayList<JasperPrint>();
		JasperPrint jasperPrint = new JasperPrint();
		
		Map<String, Object> fields = new HashMap<String, Object>();
		fields = report.reportMapper(fields);
		
		Collection<Map<String, ?>> collectionReport = new ArrayList<Map<String, ?>>();
		collectionReport.add(fields);
		JRMapCollectionDataSource parameters = new JRMapCollectionDataSource(collectionReport);

		JasperReport cape = JasperCompileManager.compileReport(ReportBuilder.class.getResourceAsStream(resource));
		jasperPrint = JasperFillManager.fillReport(cape, fields, parameters);
		jasperPrints.add(jasperPrint);
		
		return jasperPrint;
	}
}
