package br.edu.ifcvideira.Lista8;

public abstract class Exe6Imovel {
	private String endereco;
	private double preco;
	
	
	public Exe6Imovel(String endereco, double preco) {
		super();
		this.endereco = endereco;
		this.preco = preco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public abstract void calculaPreco();
	public abstract void imprimePreco();

}
