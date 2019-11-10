package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exe6Principal {
	public static void main(String[] args) {
		int op;
		String matricula;
		String nome;
		String email;
		String curso;
		String telefone;
		String celular;
		String endereco;
		
		op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Opção:\n"
				+ "1 - Construtor Vazio\n"
				+ "2 - Construtor Atributos passados por Parâmetro\n"
				+ "3 - Sair"));
		
		if (op == 1) {
			Exe6Aluno aluno = new Exe6Aluno();
			
			nome = String.valueOf(JOptionPane.showInputDialog("Digite seu nome"));
			aluno.setNome(nome);
			matricula = String.valueOf(JOptionPane.showInputDialog("Digite sua matricula"));
			aluno.setMatricula(matricula);
			email = String.valueOf(JOptionPane.showInputDialog("Digite seu email"));
			aluno.setEmail(email);
			curso = String.valueOf(JOptionPane.showInputDialog("Digite seu curso"));
			aluno.setCurso(curso);
			telefone = String.valueOf(JOptionPane.showInputDialog("Digite seu numero de telefone"));
			aluno.setTelefone(telefone);
			celular = String.valueOf(JOptionPane.showInputDialog("Digite seu numero de celular"));
			aluno.setCelular(celular);
			endereco = String.valueOf(JOptionPane.showInputDialog("Digite seu endereco"));
			aluno.setEndereco(endereco);
			
			JOptionPane.showMessageDialog(null, "Seus Dados:\n"
					+ "Nome = "+aluno.getNome()+"\n"
							+ "Matricula = "+aluno.getMatricula()+"\n"
									+ "Email = "+aluno.getEmail()+"\n"
											+ "Curso = "+aluno.getCurso()+"\n"
													+ "Telefone = "+aluno.getTelefone()+"\n"
															+ "Celular = "+aluno.getCelular()+"\n"
																	+ "Endereço = "+aluno.getEndereco());
		} else if (op == 2) {
			
			nome = String.valueOf(JOptionPane.showInputDialog("Digite seu nome"));
			matricula = String.valueOf(JOptionPane.showInputDialog("Digite sua matricula"));
			email = String.valueOf(JOptionPane.showInputDialog("Digite seu email"));
			curso = String.valueOf(JOptionPane.showInputDialog("Digite seu curso"));
			telefone = String.valueOf(JOptionPane.showInputDialog("Digite seu numero de telefone"));
			celular = String.valueOf(JOptionPane.showInputDialog("Digite seu numero de celular"));
			endereco = String.valueOf(JOptionPane.showInputDialog("Digite seu endereco"));
			
			Exe6Aluno aluno = new Exe6Aluno(nome, matricula, email, curso, telefone, celular, endereco);
			
			JOptionPane.showMessageDialog(null, "Seus Dados:\n"
					+ "Nome = "+aluno.getNome()+"\n"
							+ "Matricula = "+aluno.getMatricula()+"\n"
									+ "Email = "+aluno.getEmail()+"\n"
											+ "Curso = "+aluno.getCurso()+"\n"
													+ "Telefone = "+aluno.getTelefone()+"\n"
															+ "Celular = "+aluno.getCelular()+"\n"
																	+ "Endereço = "+aluno.getEndereco());
		}else {
			System.exit(0);
		}
		
	}

}
