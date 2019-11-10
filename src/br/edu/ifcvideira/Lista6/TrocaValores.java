/*
 * 2 – Defina uma classe em Java, que:
 Crie dois atributos, n1 e n2;
 Encapsule os atributos;
 Crie um método que troque os valores entre os atributos n1 e n2;
 Crie um método main que:
 Atribua valor aos atributos n1 e n2;
 Chame o método que altera os valores;
 Mostra os valores dos atributos;
 */
package br.edu.ifcvideira.Lista6;

public class TrocaValores {
	
	private int n1;
	private int n2;
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	
	public void trocaValor() {
		int aux, aux2;
		aux = this.getN1();
		aux2 = this.getN2();
		this.setN2(aux);
		this.setN1(aux2);
		
	}

}
