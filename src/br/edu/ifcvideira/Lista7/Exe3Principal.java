package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exe3Principal {

	public static void main(String[] args) {
		
		String nome;
		String departamento;
		String dataAdmissao;
		int registro;
		int op;
		
		nome = String.valueOf(JOptionPane.showInputDialog("Digite o seu Nome"));
		departamento = String.valueOf(JOptionPane.showInputDialog("Digite seu departamento"));
		registro = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do seu Registro"));
		dataAdmissao = String.valueOf(JOptionPane.showInputDialog("Digite sua data de Admissão"));
		
		
		
		Exe3Professor professor = new Exe3Professor(nome,departamento,registro,dataAdmissao);
		
		for(;;) {
			JOptionPane.showMessageDialog(null, "Seus Dados:\n"
					+ "Nome: "+professor.getNome()+"\n"
							+ "Departamento: "+professor.getDepartamento()+"\n"
									+ "Numero Registro: "+professor.getNumeroRegistro()+"\n"
											+ "Data de Admissão: "+professor.getDataAdmissao());
			op = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
					+ "1 - Alterar Nome\n"
					+ "2 - Alterar Departamento\n"
					+ "3 - Alterar Numero de Registro\n"
					+ "4 - Alterar Data de Admissão\n"
					+ "5 - Sair"));
			
			if (op == 1) {
				
				professor.setNome(nome = String.valueOf(JOptionPane.showInputDialog("Nome Anterior: "+professor.getNome()+"\n"
						+ "Digite seu nome")));
			}else if (op == 2) {
				professor.setDepartamento(departamento = String.valueOf(JOptionPane.showInputDialog("Departamento Anterior: "+professor.getDepartamento()+"\n"
						+ "Digite seu departamento")));
			}else if (op == 3) {
				professor.setNumeroRegistro(registro = Integer.parseInt(JOptionPane.showInputDialog("Número Registro Anterior: "+professor.getNumeroRegistro()+"\n"
						+ "Digite o numero do seu Registro")));
			}else if (op == 4) {
				professor.setDataAdmissao(dataAdmissao = String.valueOf(JOptionPane.showInputDialog("Data de Admissão Anterior: "+professor.getDataAdmissao()+"\n"
						+ "Digite sua data de Admissão")));
			}else {
				break;
			}
		}

	}

}
