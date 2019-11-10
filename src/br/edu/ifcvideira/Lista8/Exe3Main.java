package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exe3Main {

	public static void main(String[] args) {

		String nome;
		String raca;
		
		nome = String.valueOf(JOptionPane.showInputDialog("Digite o nome do cachorro:"));
		raca = String.valueOf(JOptionPane.showInputDialog("Digite a raça de "+nome));
		Exe3Cachorro cachorro = new Exe3Cachorro(nome, raca);
		
		nome = String.valueOf(JOptionPane.showInputDialog("Digite o nome do gato:"));
		raca = String.valueOf(JOptionPane.showInputDialog("Digite a raça de "+nome));
		
		Exe3Gato gato = new Exe3Gato(nome, raca);
		
		System.out.println("Nome: "+cachorro.getNome()+"\n"
				+ "Raça: "+cachorro.getRaca()+"\n"
								+ cachorro.late());
		System.out.println("Nome: "+gato.getNome()+"\n"
				+ "Raça: "+gato.getRaca()+"\n"
								+ gato.mia());
	

	}

}
