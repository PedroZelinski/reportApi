package br.com.pedrozelinski.reportApi.report.fields;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class State {
	
	@JsonProperty("data")
	private String data;
	@JsonProperty("status")
	private String status;
	@JsonProperty("cont")
	private String cont;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("data")
	public String getData() {
	return data;
	}

	@JsonProperty("data")
	public void setData(String data) {
	this.data = data;
	}

	public State withData(String data) {
	this.data = data;
	return this;
	}

	@JsonProperty("status")
	public String getStatus() {
	return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
	this.status = status;
	}

	public State withStatus(String status) {
	this.status = status;
	return this;
	}

	@JsonProperty("cont")
	public String getCont() {
	return cont;
	}

	@JsonProperty("cont")
	public void setCont(String cont) {
	this.cont = cont;
	}

	public State withCont(String cont) {
	this.cont = cont;
	return this;
	}


}
