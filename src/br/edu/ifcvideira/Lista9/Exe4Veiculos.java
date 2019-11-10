package br.edu.ifcvideira.Lista9;

public abstract class Exe4Veiculos {
	
	private int peso;
	private int velocMax;
	private float preco;
	
	public Exe4Veiculos() {
		super();
		this.peso = 0;
		this.velocMax = 0;
		this.preco = 0;
	}

	public Exe4Veiculos(int peso, int velocMax, float preco) {
		super();
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(int velocMax) {
		velocMax = velocMax;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float valorVeiculo(float valor) {
		this.preco =(float) (valor-valor*0.10);
		return this.preco;
	}
	
	

}
