package com.reciboaluguel.excecao;

import java.io.Serializable;

public class ExcecaoRecibo extends Exception implements Serializable {
	private static final long serialVersionUID = 1L;

	public ExcecaoRecibo(String erro) {
		super(erro);
	}
}
