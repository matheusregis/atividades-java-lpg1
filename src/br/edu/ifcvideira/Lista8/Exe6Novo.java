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
		preco = Double.parseDouble(JOptionPane.showInputDialog("Valor Do Imóvel: R$"+super.getPreco()+"\n"
				+ "Digite o Valor Adicional deste Imóvel:"));
		this.precoNovo = preco + super.getPreco();;
	}
	
	@Override
	public void imprimePreco() {
		System.out.println("O preço do imóvel é: R$"+super.getPreco()+"\n"
				+ "Com os valores adicionais de um Imóvel novo: R$"+this.precoNovo);
	}
}
