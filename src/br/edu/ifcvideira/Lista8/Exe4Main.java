package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exe4Main {

	public static void main(String[] args) {
		double valor;
		double valorVip;
		double valorCamaroteInferior;
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Ingresso"));
		Exe4Normal normal = new Exe4Normal(valor);
		normal.imprimeValor();
		
		Exe4Vip vip = new Exe4Vip(valor);
		vip.valorAdicional(valorVip = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Adicional do Ingresso Vip")));
		vip.imprimeValor();
		
		Exe4CamaroteInferior ci = new Exe4CamaroteInferior(valor);
		ci.cadastraLocalizacao();
		ci.imprimeLocalizacao();
		ci.valorAdicional(valorCamaroteInferior = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Adicional do Ingresso Camarote Inferior")));
		ci.imprimeValor();
		
		Exe4CamaroteSuperior cp = new Exe4CamaroteSuperior(valor);
		cp.cadastraLocalizacao();
		cp.imprimeLocalizacao();
		cp.valorAdicional(valorCamaroteInferior = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor Adicional do Ingresso Camarote Inferior")));
		cp.imprimeValor();
		
	}

}
