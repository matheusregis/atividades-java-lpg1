package br.edu.ifcvideira.Lista6;

public class Candidato {
	private String nome;
	private int numeroVotos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroVotos() {
		return numeroVotos;
	}
	public void setNumeroVotos(int numeroVotos) {
		this.numeroVotos = numeroVotos;
	}
	
	public void incrementaVotos() {
		this.setNumeroVotos(this.getNumeroVotos()+1);
	}
}
