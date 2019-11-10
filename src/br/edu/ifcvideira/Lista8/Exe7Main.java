package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exe7Main {

	public static void main(String[] args) {
		
		String codigo;
		String descricao;
		String tipo;
		String voltagem;
		String tamanho;
		String cor;
		double valor;
		
		codigo = String.valueOf(JOptionPane.showInputDialog("Digite o codigo do Alimento:"));
		descricao = String.valueOf(JOptionPane.showInputDialog("Digite a descri��o do Alimento:"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do Alimento"));
		tipo = String.valueOf(JOptionPane.showInputDialog("Digite o tipo do Alimento:"));
		
		Exe7Alimento alimento = new Exe7Alimento(codigo, descricao, valor, tipo);
		alimento.imprimeProduto();
		
		codigo = String.valueOf(JOptionPane.showInputDialog("Digite o codigo do Eletrodom�stico:"));
		descricao = String.valueOf(JOptionPane.showInputDialog("Digite a descri��o do Eletrodom�stico:"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o do Eletrodom�stico"));
		voltagem = String.valueOf(JOptionPane.showInputDialog("Digite a voltagem do Eletrodom�stico:"));
		
		Exe7Eletrodomestico eletro = new Exe7Eletrodomestico(codigo, descricao, valor, voltagem);
		eletro.imprimeProduto();
		
		codigo = String.valueOf(JOptionPane.showInputDialog("Digite o codigo da Roupa:"));
		descricao = String.valueOf(JOptionPane.showInputDialog("Digite a descri��o da Roupa:"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o da Roupa"));
		tamanho = String.valueOf(JOptionPane.showInputDialog("Digite o tamanho da Roupa:"));
		cor = String.valueOf(JOptionPane.showInputDialog("Digite a cor da Roupa:"));
		
		Exe7Roupa roupa = new Exe7Roupa(codigo, descricao, valor, tamanho, cor);
		roupa.imprimeProduto();
		
	}

}
