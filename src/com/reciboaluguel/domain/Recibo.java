package com.reciboaluguel.domain;

public class Recibo {
	private int numRecibo;
	private String descricao;
	private double valor;
	
	public Recibo() {
	}
	
	public Recibo(int numRecibo, String descricao, double valor) {
		super();
		this.numRecibo = numRecibo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getNumRecibo() {
		return numRecibo;
	}

	public void setNumRecibo(int numRecibo) {
		this.numRecibo = numRecibo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Recibo [numRecibo=" + numRecibo + ", descricao=" + descricao + ", valor=" + valor + "]";
	}
	
	
	
	
}
