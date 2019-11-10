package br.edu.ifcvideira.Lista8;

public class Exe1Gerente extends Exe1Funcionario {

	public Exe1Gerente(String nome, double salario, String cargo) {
		super(nome, salario, cargo);
		
	}

	@Override
	public double getBonificacao() {
		return super.getSalario()*0.5;
	}

}
