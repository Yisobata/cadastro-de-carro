package com.luizisobata.autoscore.domain;

import java.io.Serializable;
import java.util.Objects;

public class Veiculo implements Serializable{
	private static final long serialVersionUID = 1L;

	private String proprietario;
	private String cpf;
	private String placa;
	
	public Veiculo() {
	}

	public Veiculo(String proprietario, String cpf, String placa) {
		super();
		this.proprietario = proprietario;
		this.cpf = cpf;
		this.placa = placa;
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

	@Override
	public int hashCode() {
		return Objects.hash(cpf, placa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(placa, other.placa);
	}
}
