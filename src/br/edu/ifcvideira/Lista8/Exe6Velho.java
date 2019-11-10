package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exe6Velho extends Exe6Imovel {
	private double desconto;

	public Exe6Velho(String endereco, double preco) {
		super(endereco, preco);
		
	}

	@Override
	public void calculaPreco() {
		double valorDesconto;

		valorDesconto = Double.parseDouble(JOptionPane.showInputDialog("Valor Do Im�vel: R$"+super.getPreco()+"\n"
				+ "Digite o desconto que ser� aplicado neste Im�vel (Em Reais):"));
		this.desconto = super.getPreco() - valorDesconto;
	}

	@Override
	public void imprimePreco() {
		System.out.println("O pre�o do im�vel �: R$"+super.getPreco()+"\n"
				+ "Com os descontos por ser um Im�vel Velho: R$"+this.desconto);
	}

}
