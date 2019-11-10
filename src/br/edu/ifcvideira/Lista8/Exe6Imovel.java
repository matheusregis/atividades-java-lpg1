/*
 * 6 - Crie a classe Imovel, que possui um endereço e um preço.
a. Crie uma classe Novo, que herda Imovel e possui um adicional no preço. Crie
métodos de acesso e impressão deste valor adicional e um método polimórfico
para cálculo do preço;
b. Crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie
métodos de acesso e impressão para este desconto e um método polimórfico para
cálculo do preço;
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
