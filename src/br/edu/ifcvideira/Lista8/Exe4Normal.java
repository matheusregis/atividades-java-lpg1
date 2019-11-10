package br.edu.ifcvideira.Lista8;

public class Exe4Normal extends Exe4Ingresso {
	
	public Exe4Normal(double valor) {
		super(valor);
		
	}

	public void imprimeValor() {
		System.out.println("Ingresso Normal: R$"+super.getValor());
	}
}
