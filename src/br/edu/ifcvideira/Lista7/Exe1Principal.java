package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exe1Principal {
	public static void main(String[] args) {
		String nome;
		int idade;
		int op;
		
		//Mesma coisa do modelo 2
		Exe1Pessoa p1 = new Exe1Pessoa();
		nome = String.valueOf(JOptionPane.showInputDialog("Digite o nome da pessoa 1:"));
		p1.setNome(nome);
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de "+nome));
		p1.setIdade(idade);
		
		
		//Modelo mais facil
		nome = String.valueOf(JOptionPane.showInputDialog("Digite o nome da pessoa 2:"));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de "+nome));
		Exe1Pessoa p2 = new Exe1Pessoa(nome, idade);
		
		nome = String.valueOf(JOptionPane.showInputDialog("Digite o nome da pessoa 3:"));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade de "+nome));
		Exe1Pessoa p3 = new Exe1Pessoa(nome, idade);
		
		for(;;) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Quem fez aniversário:\n"
					+ "1 - "+p1.getNome()+"\n"
							+ "2 - "+p2.getNome()+"\n"
									+ "3 - "+p3.getNome()+"\n"
											+ "4 - Finalizar"));
			
			if (op == 1) {
				p1.fazAniversario();
			}else if (op==2) {
				p2.fazAniversario();
			}else if (op==3) {
				p3.fazAniversario();
			}else if (op==4) {
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Opção Inválida!");
			}
		}
	
		
		JOptionPane.showMessageDialog(null, "Dados finais das pessoas:\n"
				+ p1.getNome()+ " - "+p1.getIdade()+ " anos \n"
						+ p2.getNome()+ " - "+p2.getIdade()+ " anos \n"
								+ p3.getNome()+ " - "+p3.getIdade()+ " anos \n");
		
	}

}
