/*
 * 1 - Escreva as seguintes classes:
a) Uma classe Pessoa atributos nome (tipo String) e sobrenome (tipo String). Cada um
desses atributos deve ter m�todos para l�-los e alter�-los (getters e setters). A classe Pessoa
ainda deve ter um m�todo chamado getNomeCompleto que n�o possui par�metros de
entrada e que retorna a concatena��o do atributo nome com o atributo sobrenome. Al�m
disso, a classe deve possuir um construtor sem par�metros e um outro construtor que
recebe como par�metros o nome e o sobrenome da pessoa e altera respectivamente os
atributos nome e sobrenome.
b) Uma subclasse de Pessoa, chamada Funcionario. A classe Funcionario deve ter os
atributos matricula (tipo int) e salario (tipo double), com seus respectivos m�todos para
leitura e altera��o (getters e setters). O sal�rio de um funcion�rio jamais poder� ser
negativo. Todo funcionario recebe seu salario em duas parcelas, sendo 60% na primeira
parcela e 40% na segunda parcela. Assim, escreva os m�todos getSalarioPrimeiraParcela
que retorna o valor da primeira parcela do sal�rio (60%) e getSalarioSegundaParcela que
retorna o valor da segunda parcela do sal�rio (40%).
c) Uma subclasse de Funcionario, chamada Professor. Todo professor recebe seu sal�rio
em uma �nica parcela. Assim, deve-se sobrescrever os m�todos
getSalarioPrimeiraParcela e getSalarioSegundaParcela. O m�todo
getSalarioPrimeiraParcela da classe Professor deve retornar o valor integral do sal�rio do
professor e o m�todo getSalarioSegundaParcela do professor deve retornar o valor zero.
d) Uma classe UsaPessoa que instancia os seguintes objetos:
pessoa1 (Pessoa)
nome: Mario
sobrenome: Lopes
pessoa2 (Funcionario)
nome: Lucas
sobrenome: Mendes
salario: 2000.00
pessoa3 (Professor)
nome: Rafael
sobrenome: Lira
salario: 500.00
Depois disso, execute as seguintes opera��es na seguinte ordem:
e) Exibir a sa�da do m�todo getNomeCompleto para os 3 objetos.
f) Exibir a sa�da dos m�todos getSalarioPrimeiraParcela e getSalarioSegundaParcela
para os objetos pessoa2 e pessoa3.

 */
package br.edu.ifcvideira.Lista9;

public class Exe1Pessoa {

	private String nome;
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Exe1Pessoa() {
		
	}
	public Exe1Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public String getNomeCompleto() {
		return this.getNome() + " " + this.getSobrenome();
	}	
}
