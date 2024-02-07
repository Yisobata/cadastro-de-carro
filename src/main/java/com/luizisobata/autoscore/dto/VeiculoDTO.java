package com.luizisobata.autoscore.dto;

public class VeiculoDTO {

	private Integer id;
	private String proprietario;
	private String cpf;
	private String placa;
	private String marca;
	private String modelo;
	private String chassi;
	private Boolean licenciado;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public Boolean getLicenciado() {
		return licenciado;
	}
	public void setLicenciado(Boolean licenciado) {
		this.licenciado = licenciado;
	}

}
