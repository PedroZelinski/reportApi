package br.com.pedrozelinski.reportApi.report.reports;

import java.io.IOException;
import java.util.Map;

public interface IReport {
	public Map<String, Object> reportMapper (Map<String, Object> fields) throws IOException;
}
