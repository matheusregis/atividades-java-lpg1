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
		descricao = String.valueOf(JOptionPane.showInputDialog("Digite a descrição do Alimento:"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Alimento"));
		tipo = String.valueOf(JOptionPane.showInputDialog("Digite o tipo do Alimento:"));
		
		Exe7Alimento alimento = new Exe7Alimento(codigo, descricao, valor, tipo);
		alimento.imprimeProduto();
		
		codigo = String.valueOf(JOptionPane.showInputDialog("Digite o codigo do Eletrodoméstico:"));
		descricao = String.valueOf(JOptionPane.showInputDialog("Digite a descrição do Eletrodoméstico:"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Eletrodoméstico"));
		voltagem = String.valueOf(JOptionPane.showInputDialog("Digite a voltagem do Eletrodoméstico:"));
		
		Exe7Eletrodomestico eletro = new Exe7Eletrodomestico(codigo, descricao, valor, voltagem);
		eletro.imprimeProduto();
		
		codigo = String.valueOf(JOptionPane.showInputDialog("Digite o codigo da Roupa:"));
		descricao = String.valueOf(JOptionPane.showInputDialog("Digite a descrição da Roupa:"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da Roupa"));
		tamanho = String.valueOf(JOptionPane.showInputDialog("Digite o tamanho da Roupa:"));
		cor = String.valueOf(JOptionPane.showInputDialog("Digite a cor da Roupa:"));
		
		Exe7Roupa roupa = new Exe7Roupa(codigo, descricao, valor, tamanho, cor);
		roupa.imprimeProduto();
		
	}

}
