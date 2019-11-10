package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exe1AssistenteAdministrativo extends Exe1Funcionario{
	
	public Exe1AssistenteAdministrativo(String nome, double salario, String cargo) {
		super(nome, salario, cargo);
		// TODO Auto-generated constructor stub
	}
	private String matricula;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public double getBonificacao() {
		int op;
		op = Integer.parseInt(JOptionPane.showInputDialog("Qual seu turno "
				+ "1 - Dia"
				+ "2 - Noite"));
		if (op == 2) {
			return super.getSalario()*0.3;
		}else {
			return 0;
		}
		
	}
	
	
	
}
