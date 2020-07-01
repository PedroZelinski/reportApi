package br.com.pedrozelinski.reportApi.report.reports;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.pedrozelinski.utils.Constants;

public class Cape implements IReport{


	@JsonProperty("cliente")
	private String cliente;
	@JsonProperty("projeto")
	private String projeto;
	
	public Cape (String cliente, String projeto) {
		setCliente(cliente);
		setProjeto(projeto);
	}

	@Override
	public Map<String, Object> reportMapper(Map<String, Object> fields) throws IOException {
		StringBuilder cape = Constants.CAPA_BASE64();
		fields.put("cliente", this.getCliente());
		fields.put("projeto", this.getProjeto());
		fields.put("capa", cape.toString());
		return fields;
	}
	
	
	@JsonProperty("cliente")
	public String getCliente() {
	return cliente;
	}

	@JsonProperty("cliente")
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Cape withCliente(String cliente) {
	this.cliente = cliente;
	return this;
	}
	
	@JsonProperty("projeto")
	public String getProjeto() {
	return projeto;
	}

	@JsonProperty("projeto")
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public Cape withProjeto(String projeto) {
	this.projeto = projeto;
	return this;
	}

}
