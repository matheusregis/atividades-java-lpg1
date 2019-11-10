package br.edu.ifcvideira.Lista9;

public class Exe1Professor extends Exe1Funcionario{

	public Exe1Professor(String nome, String sobrenome, int matricula, double salario) {
		super(nome, sobrenome, matricula, salario);
	}
	public double getSalarioPrimeiraParcela() {
		return super.getSalarioPrimeiraParcela()+ super.getSalarioSegundaParcela();
	}
	public double getSalarioSegundaParcela() {
		return 0;
	}
	public Exe1Professor() {
		
	}
	
}
