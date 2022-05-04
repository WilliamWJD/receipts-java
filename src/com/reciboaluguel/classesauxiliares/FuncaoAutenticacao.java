package com.reciboaluguel.classesauxiliares;

import com.reciboaluguel.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {
	
	public boolean funcaoAutenticar(PermitirAcesso acesso) {
		return acesso.autenticar();
	}
}
