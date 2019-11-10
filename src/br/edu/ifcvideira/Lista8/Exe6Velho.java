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

		valorDesconto = Double.parseDouble(JOptionPane.showInputDialog("Valor Do Imóvel: R$"+super.getPreco()+"\n"
				+ "Digite o desconto que será aplicado neste Imóvel (Em Reais):"));
		this.desconto = super.getPreco() - valorDesconto;
	}

	@Override
	public void imprimePreco() {
		System.out.println("O preço do imóvel é: R$"+super.getPreco()+"\n"
				+ "Com os descontos por ser um Imóvel Velho: R$"+this.desconto);
	}

}
