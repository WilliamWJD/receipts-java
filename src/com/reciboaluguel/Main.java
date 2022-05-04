package com.reciboaluguel;

import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;

import com.reciboaluguel.domain.Imovel;
import com.reciboaluguel.domain.Inquilino;
import com.reciboaluguel.domain.Recibo;
import com.reciboaluguel.interfaces.PermitirAcesso;

public class Main {
	
	public static void main(String[] args) {
		String usuario = JOptionPane.showInputDialog("Digite o  usu�rio: ");
		String senha = JOptionPane.showInputDialog("Digite a senha: ");
		
		if (!new Inquilino().autenticar(usuario, senha)) {
			JOptionPane.showMessageDialog(null, "Usu�rio ou senha inv�lidos !");

		} else {
			String nomeImovel = JOptionPane.showInputDialog("Digite o nome do im�vel: ");
			double valorImovel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do im�vel: "));

			Imovel imovel1 = new Imovel(nomeImovel, valorImovel);
			Inquilino inquilino1 = new Inquilino(new Date(), "William", "123456789", "789456123", imovel1);

			Recibo rec1 = new Recibo(1, "Pagamento de conta mensal no bar", 550.55);
			Recibo rec2 = new Recibo(2, "Pagamento de aluguel", 550.55);

			inquilino1.getRecibos().addAll(Arrays.asList(rec1, rec2));

			System.out.println("Inquilino: " + inquilino1.getNome());
			System.out.println("Im�vel: " + inquilino1.getImovel().getNomeImovel());
			System.out.println("Valor R$: " + inquilino1.getImovel().getValorImovel());
			for (Recibo rec : inquilino1.getRecibos()) {
				System.out.println("------ N� Rec: " + rec.getNumRecibo());
				System.out.println("------ Descri��o: " + rec.getDescricao());
				System.out.println("------ Valor R$: : " + rec.getValor());
				System.out.println("\n");
			}
		}
	}

}
