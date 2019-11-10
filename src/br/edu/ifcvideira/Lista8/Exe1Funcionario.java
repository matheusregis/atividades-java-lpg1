/*
 * 1 - Implemente a classe Funcionario (nome, salario e cargo).
a. Crie as classes Gerente, Assistente Tecnico e Assistente Administrativo.
b. Somente o Assistente Administrativo, que também é um funcionário, possui um
número de matrícula.
c. Sabendo que os Assistentes Técnicos possuem um bônus salarial (20%) e que
os Assistentes Administrativos possuem um turno (dia ou noite) e um adicional
noturno(30%).
d. A classe Gerente possui um bônus adicional diferenciado(50%).
e. Implemente uma classe main para inserir valores para todos os casos.
 */
package br.edu.ifcvideira.Lista8;

public abstract class Exe1Funcionario {
	
	private String nome;
	private double salario;
	private String cargo;
	
	public abstract double getBonificacao();
	
	public Exe1Funcionario(String nome, double salario, String cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
