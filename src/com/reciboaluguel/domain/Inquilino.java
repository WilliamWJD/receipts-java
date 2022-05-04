package com.reciboaluguel.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.reciboaluguel.interfaces.PermitirAcesso;

public class Inquilino extends Pessoa implements PermitirAcesso{
	private Date dataCadastro;
	
	Imovel imovel;
	List<Recibo> recibos = new ArrayList<Recibo>();
	
	public Inquilino() {
	}

	public Inquilino(Date dataCadastro, String nome, String rg, String cpf, Imovel imovel) {
		super.nome = nome;
		super.rg = rg;
		super.cpf = cpf;
		this.dataCadastro = dataCadastro;
		this.imovel = imovel;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	
	public List<Recibo> getRecibos() {
		return recibos;
	}

	public void setRecibos(List<Recibo> recibos) {
		this.recibos = recibos;
	}
	
	
	
	@Override
	public String toString() {
		return "Inquilino [dataCadastro=" + dataCadastro + ", imovel=" + imovel + ", recibos=" + recibos + "]";
	}

	@Override
	public boolean autenticar(String usuario, String senha) {
		if(usuario.equals("admin") && senha.equals("admin")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return false;
	}
}
