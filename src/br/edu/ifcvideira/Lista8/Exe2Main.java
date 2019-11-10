package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exe2Main {

	public static void main(String[] args) {
		String nome;
		double salario;
		String cargo;
		
		nome = String.valueOf(JOptionPane.showInputDialog("Digite o nome:"));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário de "+nome));
		cargo = String.valueOf(JOptionPane.showInputDialog("Digite o cargo de "+nome));
		Exe1Funcionario at = new Exe1AssistenteTecnico(nome, salario, cargo);
		
		nome = String.valueOf(JOptionPane.showInputDialog("Digite o nome:"));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário de "+nome));
		cargo = String.valueOf(JOptionPane.showInputDialog("Digite o cargo de "+nome));
		Exe1Funcionario aa = new Exe1AssistenteAdministrativo(nome, salario, cargo);
		
		nome = String.valueOf(JOptionPane.showInputDialog("Digite o nome:"));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário de "+nome));
		cargo = String.valueOf(JOptionPane.showInputDialog("Digite o cargo de "+nome));
		Exe1Funcionario g = new Exe1Gerente(nome, salario, cargo);
		
		System.out.println("Nome: "+at.getNome()+"\n"
				+ "Cargo: "+at.getCargo()+"\n"
						+ "Salário: R$"+at.getSalario()+"\n"
								+ "Bonificação: R$"+at.getBonificacao());
		
		System.out.println("Nome: "+aa.getNome()+"\n"
				+ "Cargo: "+aa.getCargo()+"\n"
						+ "Salário: R$"+aa.getSalario()+"\n"
								+ "Bonificação: R$"+aa.getBonificacao());
		
		System.out.println("Nome: "+g.getNome()+"\n"
				+ "Cargo: "+g.getCargo()+"\n"
						+ "Salário: R$"+g.getSalario()+"\n"
								+ "Bonificação: R$"+g.getBonificacao());

	}

}
