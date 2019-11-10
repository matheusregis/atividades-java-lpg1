package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nomeProduto[] = new String[3];
		int codigoProduto[] = new int[3];
		double precoProduto[] = new double[3];
		int quantidadeProduto[] = new int[3];
		int verificaCodigo[] = new int[3];
		int aux;
		int i;
		int pos = 3;

		for (i = 0; i < pos; i++) {
			System.out.println("Digite o nome do Produto "+(i+1));
			nomeProduto[i] = String.valueOf(in.nextLine());
			System.out.println("Digite a quantidade que será cadastrada do produto " + nomeProduto[i]);
			quantidadeProduto[i] = Integer.parseInt(in.nextLine());
			System.out.println("Digite o Valor Unitário do Produto " + nomeProduto[i]);
			precoProduto[i] = Double.parseDouble(in.nextLine());
			System.out.println("Digite o Código do Produto "+(i+1)+"(Somente Códigos entre 0 e 9)");
			codigoProduto[i] = Integer.parseInt(in.nextLine());
			if (codigoProduto[i] < 0 || codigoProduto[i] > 9) {
				System.out.println("Valor do código Inválido!");
				System.exit(0);
			}
			
		}
			
	}

}

