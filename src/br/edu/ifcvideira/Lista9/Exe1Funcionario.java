package br.edu.ifcvideira.Lista9;

public class Exe1Funcionario extends Exe1Pessoa{

	private int matricula;
	private double salario;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalarioPrimeiraParcela() {
		return salario * 0.4;
	}
	public double getSalarioSegundaParcela() {
		return salario * 0.6;
	}
	public Exe1Funcionario() {
		
	}
	public Exe1Funcionario(String nome, String sobrenome,int matricula, double salario) {
		super(nome, sobrenome);
		this.matricula = matricula;
		this.salario = salario;
	}
	
	
}
