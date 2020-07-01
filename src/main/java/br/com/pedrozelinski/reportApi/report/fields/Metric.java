package br.com.pedrozelinski.reportApi.report.fields;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Metric {

	@JsonProperty("criticidade")
	private String criticidade;
	@JsonProperty("risco")
	private String risco;
	@JsonProperty("facilidade")
	private String facilidade;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("criticidade")
	public String getCriticidade() {
	return criticidade;
	}
	
	@JsonProperty("criticidadeformatado")
	public String getCriticidadeformatado() {
	return criticidade;
	}

	@JsonProperty("criticidade")
	public void setCriticidade(String criticidade) {
	this.criticidade = criticidade;
	}

	public Metric withCriticidade(String criticidade) {
	this.criticidade = criticidade;
	return this;
	}
	
	@JsonProperty("riscoformatado")
	public String getRiscoformatado() {
	return risco;
	}

	@JsonProperty("risco")
	public String getRisco() {
	return risco;
	}

	@JsonProperty("risco")
	public void setRisco(String risco) {
	this.risco = risco;
	}

	public Metric withRisco(String risco) {
	this.risco = risco;
	return this;
	}

	@JsonProperty("facilidadeformatado")
	public String getFacilidadeformatado() {
	return facilidade;
	}


	@JsonProperty("facilidade")
	public String getFacilidade() {
	return facilidade;
	}

	@JsonProperty("facilidade")
	public void setFacilidade(String facilidade) {
	this.facilidade = facilidade;
	}

	public Metric withFacilidade(String facilidade) {
	this.facilidade = facilidade;
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

	public Metric withAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	return this;
	}


}
