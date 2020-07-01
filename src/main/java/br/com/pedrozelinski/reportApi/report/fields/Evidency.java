package br.com.pedrozelinski.reportApi.report.fields;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Evidency {
		
	@JsonProperty("item")
	private Integer item;
	@JsonProperty("typeRequest")
	private String typeRequest;
	@JsonProperty("legenda")
	private String legenda;
	@JsonProperty("body")
	private String body;
	@JsonProperty("base64")
	private String base64;
	@JsonProperty("commit")
	private String commit;
	@JsonProperty("branch")
	private String branch;
	@JsonProperty("repositorio")
	private String repositorio;
	@JsonProperty("arquivo")
	private String arquivo;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("item")
	public Integer getItem() {
	return item;
	}
	
	@JsonProperty("item")
	public void setItem(Integer item) {
	this.item = item;
	}
	
	@JsonProperty("typeRequest")
	public String getTypeRequest() {
	return typeRequest;
	}
	
	@JsonProperty("typeRequest")
	public void setTypeRequest(String typeRequest) {
	this.typeRequest = typeRequest;
	}
	
	@JsonProperty("legenda")
	public String getLegenda() {
	return legenda;
	}
	
	@JsonProperty("legenda")
	public void setLegenda(String legenda) {
	this.legenda = legenda;
	}
	
	@JsonProperty("body")
	public String getBody() {
	return body;
	}
	
	@JsonProperty("body")
	public void setBody(String body) {
	this.body = body;
	}
	
	@JsonProperty("base64")
	public String getBase64() {
	return base64;
	}
	
	//split para separar a chave recedida pelo json do valor em base 64 da imagem
	@JsonProperty("base64")
	public void setBase64(String base64) {
		this.base64 = base64.contains(",") ?  base64.split(",")[1] :  base64;
	}
	
	@JsonProperty("commit")
	public String getCommit() {
	return commit;
	}
	
	@JsonProperty("commit")
	public void setCommit(String commit) {
	this.commit = commit;
	}
	
	@JsonProperty("branch")
	public String getBranch() {
	return branch;
	}
	
	@JsonProperty("branch")
	public void setBranch(String branch) {
	this.branch = branch;
	}
	
	@JsonProperty("repositorio")
	public String getRepositorio() {
	return repositorio;
	}
	
	@JsonProperty("repositorio")
	public void setRepositorio(String repositorio) {
	this.repositorio = repositorio;
	}
	
	@JsonProperty("arquivo")
	public String getArquivo() {
	return arquivo;
	}
	
	@JsonProperty("arquivo")
	public void setArquivo(String arquivo) {
	this.arquivo = arquivo;
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}
	
	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
	
}
