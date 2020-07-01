package br.com.pedrozelinski.reportApi.report.fields;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Reference {

	@JsonProperty("cve")
	private String cve;
	
	@JsonProperty("cwe")
	private String cwe;
	
	@JsonProperty("cvss")
	private Double cvss;
	
	@JsonProperty("cvss_string")
	private String cvssString;	
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("cve")
	public String getCve() {
	return cve;
	}

	@JsonProperty("cve")
	public void setCve(String cve) {
	this.cve = cve;
	}

	public Reference withCve(String cve) {
	this.cve = cve;
	return this;
	}

	@JsonProperty("cwe")
	public String getCwe() {
	return cwe;
	}

	@JsonProperty("cwe")
	public void setCwe(String cwe) {
	this.cwe = cwe;
	}

	public Reference withCwe(String cwe) {
	this.cwe = cwe;
	return this;
	}

	@JsonProperty("cvss")
	public Double getCvss() {
	return cvss;
	}

	@JsonProperty("cvss")
	public void setCvss(Double cvss) {
	this.cvss = cvss;
	}

	public Reference withCvss(Double cvss) {
	this.cvss = cvss;
	return this;
	}
	
	//variavel alterada por motivo de conflito na ferramenta de geracao do relatorio
	@JsonProperty("cvsscompleto")
	public String getCvssCompleto() {
	return cvssString;
	}

	@JsonProperty("cvss_string")
	public String getCvssString() {
	return cvssString;
	}
	
	@JsonProperty("cvss_string")
	public void setCvsString(String cvssString) {
	this.cvssString = cvssString;
	}

	public Reference withCvssString(String cvssString) {
	this.cvssString = cvssString;
	return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	public Reference withAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	return this;
	}
		
}
