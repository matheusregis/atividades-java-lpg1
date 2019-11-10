package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exe6Novo extends Exe6Imovel {
	private double precoNovo;
	
	public Exe6Novo(String endereco, double preco) {
		super(endereco, preco);
		
	}

	public double getPrecoNovo() {
		return precoNovo;
	}

	public void setPrecoNovo(double precoNovo) {
		this.precoNovo = precoNovo;
	}
	@Override
	public void calculaPreco() {
		double preco;
		preco = Double.parseDouble(JOptionPane.showInputDialog("Valor Do Im�vel: R$"+super.getPreco()+"\n"
				+ "Digite o Valor Adicional deste Im�vel:"));
		this.precoNovo = preco + super.getPreco();;
	}
	
	@Override
	public void imprimePreco() {
		System.out.println("O pre�o do im�vel �: R$"+super.getPreco()+"\n"
				+ "Com os valores adicionais de um Im�vel novo: R$"+this.precoNovo);
	}
}
