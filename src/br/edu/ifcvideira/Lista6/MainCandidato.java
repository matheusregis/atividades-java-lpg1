package br.edu.ifcvideira.Lista6;

import java.util.Scanner;

public class MainCandidato {

	public static void main(String[] args) {
		int op;
		String nome;
		Candidato c1 = new Candidato();
		Candidato c2 = new Candidato();
		Candidato c3 = new Candidato();
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite o nome do candidato 1");
		nome = String.valueOf(in.nextLine());
		c1.setNome(nome);
		
		System.out.println("Digite o nome do candidato 2");
		nome = String.valueOf(in.nextLine());
		c2.setNome(nome);
		
		System.out.println("Digite o nome do candidato 3");
		nome = String.valueOf(in.nextLine());
		c3.setNome(nome);
		
		
		for(;;) {
			
			System.out.println("Menu Candidatos: Escolha um numero para votar\n"
					+ "1 - "+c1.getNome()+"\n"
							+ "2 - "+c2.getNome()+"\n"
									+ "3 - "+c3.getNome()+"\n"
											+ "4 - Sair");
			op = Integer.parseInt(in.nextLine());
			
			if (op == 1) {
				c1.incrementaVotos();
			}else if (op == 2) {
				c2.incrementaVotos();
			}else if (op == 3) {
				c3.incrementaVotos();
			}else {
				break;
			}

		}
		
		System.out.println("Votos Candidatos: \n"
				+ "1 - "+c1.getNome()+" = "+c1.getNumeroVotos()+"\n"
						+ "2 - "+c2.getNome()+" = "+c2.getNumeroVotos()+"\n"
								+ "3 - "+c3.getNome()+" = "+c3.getNumeroVotos());
		
		
	}

}
