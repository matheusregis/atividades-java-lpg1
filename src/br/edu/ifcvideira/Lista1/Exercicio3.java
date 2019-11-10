package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		int idade;
		double salario;
		
		System.out.println("Qual o nome da pessoa:");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("Qual a idade de "+nome);
		idade = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual o salário de "+nome);
		salario = Double.parseDouble(in.nextLine());
		
		System.out.println("Dados da pessoa:\n"
				+ "Nome: "+nome+"\n"
						+ "Idade: "+idade+" anos\n"
								+ "Salário: R$"+salario+"\n");
		
		in.close();
		
	}

}
