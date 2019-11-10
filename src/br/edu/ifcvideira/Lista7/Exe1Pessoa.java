package br.edu.ifcvideira.Lista7;

public class Exe1Pessoa {
	private String nome;
	private int idade;
	
	public Exe1Pessoa(){
		
	}
	public Exe1Pessoa(String nome, int idade) {
		this.nome=nome;
		this.idade=idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void fazAniversario() {
		this.setIdade(this.getIdade()+1);
	}
	

}
