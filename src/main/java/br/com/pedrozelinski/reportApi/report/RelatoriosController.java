package br.com.pedrozelinski.reportApi.report;

import java.util.Base64;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedrozelinski.reportApi.report.reports.Vulnerability;
import br.com.pedrozelinski.utils.Constants;

@RestController
public class RelatoriosController {
	
	@RequestMapping(value = Constants.REPORT_ROUTE,method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object> buildReport(@RequestBody Vulnerability relatorio, @PathVariable String reportModel) {
		try {
		    byte[] reportPdf = RelatorioBean.reportPdfBuilder(relatorio, reportModel);
		    if(reportPdf != null) {
			    reportPdf = Base64.getEncoder().encode(reportPdf);	
				return new ResponseEntity<Object>(reportPdf, HttpStatus.OK);
			} else {
				throw new Exception(Constants.ERROR_MESSAGE_RETURN);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(500).body(Constants.ERROR_MESSAGE_RETURN);
		}
	}
}
