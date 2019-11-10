/*
 * 1 – Faça um programa utilizando arrayList que permita: inserir alunos de uma
escola, consultar se um aluno específico está na lista, inserir alunos no meio da
lista em uma posição específica, remover qualquer aluno que está na lista e
consultar a qualquer momento.
 */
package br.edu.ifcvideira.Lista5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> alunos = new ArrayList<String>();
		int i;
		int pos;
		int op;
		String nome;
		
		for(;;) {
			System.out.println("Escolha uma opção:\n"
					+ "1 - Inserir\n"
					+ "2 - Buscar\n"
					+ "3 - Remover\n"
					+ "4 - Listar\n"
					+ "5 - Sair");
			op = Integer.parseInt(in.nextLine());
			
			if (op==1) {
				System.out.println("Como deseja inserir:\n"
						+ "1 - No Final\n"
						+ "2 - Em posição específica");
				op = Integer.parseInt(in.nextLine());
				
				System.out.println("Qual nome deseja inserir:\n");
				nome = String.valueOf(in.nextLine());
				if (op==1) {
					//no final
					alunos.add(nome);
				}else if (op==2) {
					//posição específica
					System.out.println("Qual posição deseja inserir:\n");
					pos = Integer.parseInt(in.nextLine());
					alunos.add((pos-1), nome);
				}else {
					System.out.println("Opção Inválida");
				}
			}else if (op==2) {
				//buscar
				System.out.println("Como deseja buscar:\n"
						+ "1 - Nome\n"
						+ "2 - Posição\n");
				op = Integer.parseInt(in.nextLine());
				
				if (op==1) {
					System.out.println("Qual o nome que deseja buscar:");
					nome = String.valueOf(in.nextLine());
					
					if (alunos.contains(nome)) {
						System.out.println("O nome "+nome+" foi encontrado na posição "+(alunos.indexOf(nome)+1));
					}else {
						System.out.println("O nome "+nome+" não foi encontrado");
					}
					
				}else if (op==2) {
					System.out.println("Qual a posição que deseja consultar:\n");
					pos = Integer.parseInt(in.nextLine());
					
					if (alunos.size()>=pos) {
						System.out.println("O nome "+alunos.get(pos-1)+" foi encontrado na posição "+pos);
					}
				}else {
					System.out.println("Opção não encontrada");
				}
			}else if (op==3) {
				//remover
				System.out.println("Como deseja remover:\n"
						+ "1 - Nome\n"
						+ "2 - Posição\n"
						+ "3 - Limpar lista");
				op = Integer.parseInt(in.nextLine());
				
				if (op==1) {
					//remover nome
					System.out.println("Qual nome do aluno deseja remover:\n");
					nome = String.valueOf(in.nextLine());
					
					if (alunos.contains(nome)) {
						System.out.println("O nome "+nome+ " foi removido da posição "+(alunos.indexOf(nome)+1));
						alunos.remove(nome);
					}else {
						System.out.println("O nome "+nome+" não existe");
					}
					
				}else if (op==2) {
					//remover pos
					System.out.println("Qual a posição que deseja remover:\n");
					pos = Integer.parseInt(in.nextLine());
					
					if (alunos.size()>=pos) {
						System.out.println("O nome "+alunos.get(pos-1)+" foi removido da posição"+pos);
						alunos.remove(pos-1);
					}else {
						System.out.println("A posição "+pos+" não existe na lista!");
					}
				}else if (op==3) {
					//limpar td
					alunos.clear();
				}else {
					System.out.println("Opção Inválida!!");
				}
			}else if (op==4) {
				//Listar
				System.out.println(alunos);
			}else if (op==5){
				//sair
				break;
			}else {
				System.out.println("Opção Inválida!");
			}
		}
	}
	
	
	

}
