package br.edu.ifcvideira.Lista6;

public class Contador {
	
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int incrementaNumero() {
		this.setNumero(this.getNumero()+1);
		return numero;
	}
	public int desfazIncrementoNumero() {
		this.setNumero(this.getNumero()-1);
		return numero;
		
	}
	

}
