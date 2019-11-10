/*
 * 1 - Escreva as seguintes classes:
a) Uma classe Pessoa atributos nome (tipo String) e sobrenome (tipo String). Cada um
desses atributos deve ter métodos para lê-los e alterá-los (getters e setters). A classe Pessoa
ainda deve ter um método chamado getNomeCompleto que não possui parâmetros de
entrada e que retorna a concatenação do atributo nome com o atributo sobrenome. Além
disso, a classe deve possuir um construtor sem parâmetros e um outro construtor que
recebe como parâmetros o nome e o sobrenome da pessoa e altera respectivamente os
atributos nome e sobrenome.
b) Uma subclasse de Pessoa, chamada Funcionario. A classe Funcionario deve ter os
atributos matricula (tipo int) e salario (tipo double), com seus respectivos métodos para
leitura e alteração (getters e setters). O salário de um funcionário jamais poderá ser
negativo. Todo funcionario recebe seu salario em duas parcelas, sendo 60% na primeira
parcela e 40% na segunda parcela. Assim, escreva os métodos getSalarioPrimeiraParcela
que retorna o valor da primeira parcela do salário (60%) e getSalarioSegundaParcela que
retorna o valor da segunda parcela do salário (40%).
c) Uma subclasse de Funcionario, chamada Professor. Todo professor recebe seu salário
em uma única parcela. Assim, deve-se sobrescrever os métodos
getSalarioPrimeiraParcela e getSalarioSegundaParcela. O método
getSalarioPrimeiraParcela da classe Professor deve retornar o valor integral do salário do
professor e o método getSalarioSegundaParcela do professor deve retornar o valor zero.
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
Depois disso, execute as seguintes operações na seguinte ordem:
e) Exibir a saída do método getNomeCompleto para os 3 objetos.
f) Exibir a saída dos métodos getSalarioPrimeiraParcela e getSalarioSegundaParcela
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
