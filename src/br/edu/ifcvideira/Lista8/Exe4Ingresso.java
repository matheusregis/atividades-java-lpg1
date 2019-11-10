package br.edu.ifcvideira.Lista8;

public abstract class Exe4Ingresso {
	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Exe4Ingresso(double valor) {
		super();
		this.valor = valor;
	}

	public abstract void imprimeValor();
}
