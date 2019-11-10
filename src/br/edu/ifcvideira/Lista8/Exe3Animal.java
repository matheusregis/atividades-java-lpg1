/*
 * 3 – Implemente as classes do diagrama abaixo, insira valores e os imprima:

 */
package br.edu.ifcvideira.Lista8;

public abstract class Exe3Animal {
	
	private String nome;
	private String raca;
	
	
	public Exe3Animal(String nome, String raca) {
		super();
		this.nome = nome;
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}

}
