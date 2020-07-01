package br.com.pedrozelinski.reportApi.report.fields;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentSituation {
	
	@JsonProperty("descricao")
	private String descricao;
	@JsonProperty("impacto")
	private String impacto;
	@JsonProperty("recomendacao")
	private String recomendacao;
	@JsonProperty("referencia")
	private String referencia;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("descricao")
	public String getDescricao() {
	return descricao;
	}

	@JsonProperty("descricao")
	public void setDescricao(String descricao) {
	this.descricao = descricao;
	}

	public CurrentSituation withDescricao(String descricao) {
	this.descricao = descricao;
	return this;
	}

	@JsonProperty("impacto")
	public String getImpacto() {
	return impacto;
	}

	@JsonProperty("impacto")
	public void setImpacto(String impacto) {
	this.impacto = impacto;
	}

	public CurrentSituation withImpacto(String impacto) {
	this.impacto = impacto;
	return this;
	}

	@JsonProperty("recomendacao")
	public String getRecomendacao() {
	return recomendacao;
	}

	@JsonProperty("recomendacao")
	public void setRecomendacao(String recomendacao) {
	this.recomendacao = recomendacao;
	}

	public CurrentSituation withRecomendacao(String recomendacao) {
	this.recomendacao = recomendacao;
	return this;
	}

	@JsonProperty("referencia")
	public String getReferencia() {
	return referencia;
	}

	@JsonProperty("referencia")
	public void setReferencia(String referencia) {
	this.referencia = referencia;
	}

	public CurrentSituation withReferencia(String referencia) {
	this.referencia = referencia;
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

	public CurrentSituation withAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	return this;
	}
	
	

}
