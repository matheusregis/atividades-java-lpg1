package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exe6Main {

	public static void main(String[] args) {
		
		String endereco;
		double preco;
		
		endereco = String.valueOf(JOptionPane.showInputDialog("Digite o endereço do Imóvel:"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Imóvel"));
		Exe6Novo novo = new Exe6Novo(endereco, preco);
		novo.calculaPreco();
		novo.imprimePreco();
		
		endereco = String.valueOf(JOptionPane.showInputDialog("Digite o endereço do Imóvel:"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Imóvel"));
		Exe6Velho velho = new Exe6Velho(endereco, preco);
		velho.calculaPreco();
		velho.imprimePreco();
		
	}

}
