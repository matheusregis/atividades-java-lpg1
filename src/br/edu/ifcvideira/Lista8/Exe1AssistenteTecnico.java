package br.edu.ifcvideira.Lista8;

public class Exe1AssistenteTecnico extends Exe1Funcionario {

	public Exe1AssistenteTecnico(String nome, double salario, String cargo) {
		super(nome, salario, cargo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonificacao() {
		return super.getSalario()*0.2;
	}

}
