/*
 * 5 - Crie uma classe chamada "Livro", que contenha os atributos PRIVADOS:
"titulo" do tipo String;
"autor" do tipo String;
"ano" do tipo int;
Crie uma classe main que fa�a uso da classe Livro, e crie tr�s objetos contendo os
seguintes valores:
PRIMEIRO LIVRO
(Titulo = "Fundamentos da programa��o de computadores"; Autor = "Ascencio";
Ano = 2012)
SEGUNDO LIVRO
(Titulo = "Programa��o com C"; Autor = "Professor X"; Ano = 2010) 
TERCEIRO LIVRO
(Titulo = "Programa��o com Java"; Autor = "Professor Y"; Ano = 2013)
Ao final imprimir o conte�do
 */
package br.edu.ifcvideira.Lista7;

public class Exe5Livro {
	
	private String titulo;
	private String autor;
	private int ano;
	
	public Exe5Livro() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	

}
