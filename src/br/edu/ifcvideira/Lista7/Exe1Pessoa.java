/*
 * 1 - Fa�a uma classe Pessoa, que possui os seguintes atributos: nome e idade. A
cada anivers�rio a idade desta pessoa aumenta um ano. Fa�a um m�todo que
represente este fato (ex: void fazAniversario()). Em seguida crie a classe main que
deve criar 3 pessoas com nome e idade inicial, incremente suas idades utilizando
o m�todo fazAnivers�rio, em seguida imprima o nome e idade destas pessoas.
 */
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
