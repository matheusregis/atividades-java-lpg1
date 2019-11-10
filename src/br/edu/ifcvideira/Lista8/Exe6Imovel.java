/*
 * 6 - Crie a classe Imovel, que possui um endere�o e um pre�o.
a. Crie uma classe Novo, que herda Imovel e possui um adicional no pre�o. Crie
m�todos de acesso e impress�o deste valor adicional e um m�todo polim�rfico
para c�lculo do pre�o;
b. Crie uma classe Velho, que herda Imovel e possui um desconto no pre�o. Crie
m�todos de acesso e impress�o para este desconto e um m�todo polim�rfico para
c�lculo do pre�o;
 */
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
