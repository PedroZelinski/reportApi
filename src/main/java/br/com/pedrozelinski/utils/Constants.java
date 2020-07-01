package br.com.pedrozelinski.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Constants {
	
	public static final String ERROR_MESSAGE_RETURN = "Ocorreu um erro.";
	
	public static final String REPORT_ROUTE = "/v1/relatorios/{reportModel}/exportacoes/{type}";
	
	public static final String CAPE_TEMPLATE = "/Cape.jrxml";

	public static final String VULNERABILITY_TEMPLATE = "/VulnerabilityReport.jrxml";
	
	public static final String RETEST_TEMPLATE =  "/RetestReport.jrxml";
	public static final String RETEST_EMPTY_ERROR =  "O ponto não possui retestes.";
	
	public static final StringBuilder CAPA_BASE64() throws IOException{
		InputStream in = Constants.class.getResourceAsStream("/Base64Cape.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder base64 = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            base64.append(line);
        }
        reader.close();
        return base64;
    }	
	
}