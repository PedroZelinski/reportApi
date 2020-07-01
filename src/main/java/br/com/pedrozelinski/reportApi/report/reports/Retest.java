package br.com.pedrozelinski.reportApi.report.reports;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.pedrozelinski.reportApi.report.fields.Evidency;
import br.com.pedrozelinski.reportApi.report.fields.Metric;

public class Retest implements IReport {
	
	@JsonProperty("metricas")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<Metric> metricas = null;
	@JsonProperty("id_reteste")
	private Integer idReteste;
	@JsonProperty("evidencias")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	private List<Evidency> evidencias = null;
	@JsonProperty("_id")
	private String id;
	@JsonProperty("descricao")
	private String descricao;
	@JsonProperty("data")
	private String data;
	@JsonProperty("status")
	private Boolean status;
	@JsonProperty("logo")
	private String logo;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public Map<String, Object> reportMapper (Map<String, Object> fields){;
		fields.put("id_reteste", this.getIdReteste());
		fields.put("metricas", this.getMetricas());
		fields.put("evidencias", this.getEvidencias());	
		fields.put("descricao", this.getDescricao());
		fields.put("data", this.getData());
		fields.put("status", this.getStatus());
		fields.put("logo", this.getLogo());
		return fields;
	}
	
	@JsonProperty("metricas")
	public List<Metric> getMetricas() {
	return metricas;
	}
	
	@JsonProperty("metricas")
	public void setMetricas(List<Metric> metricas) {
	this.metricas = metricas;
	}
	
	public Retest withMetricas(List<Metric> metricas) {
	this.metricas = metricas;
	return this;
	}
	
	@JsonProperty("id_reteste")
	public Integer getIdReteste() {
	return idReteste;
	}
	
	@JsonProperty("id_reteste")
	public void setIdReteste(Integer idReteste) {
	this.idReteste = idReteste;
	}
	
	public Retest withIdReteste(Integer idReteste) {
	this.idReteste = idReteste;
	return this;
	}
	
	@JsonProperty("evidencia")
	public List<Evidency> getEvidencias() {
	return evidencias;
	}
	
	@JsonProperty("evidencia")
	public void setEvidencias(List<Evidency> evidencias) {
	this.evidencias = evidencias;
	}
	
	public Retest withEvidencias(List<Evidency> evidencias) {
	this.evidencias = evidencias;
	return this;
	}
	
	@JsonProperty("_id")
	public String getId() {
	return id;
	}
	
	@JsonProperty("_id")
	public void setId(String id) {
	this.id = id;
	}
	
	public Retest withId(String id) {
	this.id = id;
	return this;
	}
	
	@JsonProperty("descricao")
	public String getDescricao() {
	return descricao;
	}
	
	@JsonProperty("descricao")
	public void setDescricao(String descricao) {
	this.descricao = descricao;
	}
	
	public Retest withDescricao(String descricao) {
	this.descricao = descricao;
	return this;
	}
	
	@JsonProperty("data")
	public String getData() {
	return data;
	}
	
	@JsonProperty("data")
	public void setData(String data) {
	this.data = data;
	}
	
	public Retest withData(String data) {
	this.data = data;
	return this;
	}
	
	@JsonProperty("status")
	public Boolean getStatus() {
	return status;
	}
	
	@JsonProperty("status")
	public void setStatus(Boolean status) {
	this.status = status;
	}
	
	public Retest withStatus(Boolean status) {
	this.status = status;
	return this;
	}
	
	@JsonProperty("logo")
	public String getLogo() {
	return logo;
	}
	
	@JsonProperty("logo")
	public void setLogo(String logo) {
	this.logo = logo;
	}
	
	public Retest withStatus(String logo) {
	this.logo = logo;
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
	
	public Retest withAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	return this;
	}

}