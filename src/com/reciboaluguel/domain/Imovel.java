package com.reciboaluguel.domain;

import java.io.Serializable;

public class Imovel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nomeImovel;
	private double valorImovel;
	
	public Imovel() {
	}

	public Imovel(String nomeImovel, double valorImovel) {
		super();
		this.nomeImovel = nomeImovel;
		this.valorImovel = valorImovel;
	}

	public String getNomeImovel() {
		return nomeImovel;
	}

	public void setNomeImovel(String nomeImovel) {
		this.nomeImovel = nomeImovel;
	}

	public double getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}

	@Override
	public String toString() {
		return "Imovel [nomeImovel=" + nomeImovel + ", valorImovel=" + valorImovel + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeImovel == null) ? 0 : nomeImovel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Imovel other = (Imovel) obj;
		if (nomeImovel == null) {
			if (other.nomeImovel != null)
				return false;
		} else if (!nomeImovel.equals(other.nomeImovel))
			return false;
		return true;
	}
	
	
}
