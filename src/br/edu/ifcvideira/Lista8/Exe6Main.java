package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exe6Main {

	public static void main(String[] args) {
		
		String endereco;
		double preco;
		
		endereco = String.valueOf(JOptionPane.showInputDialog("Digite o endere�o do Im�vel:"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do Im�vel"));
		Exe6Novo novo = new Exe6Novo(endereco, preco);
		novo.calculaPreco();
		novo.imprimePreco();
		
		endereco = String.valueOf(JOptionPane.showInputDialog("Digite o endere�o do Im�vel:"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do Im�vel"));
		Exe6Velho velho = new Exe6Velho(endereco, preco);
		velho.calculaPreco();
		velho.imprimePreco();
		
	}

}
