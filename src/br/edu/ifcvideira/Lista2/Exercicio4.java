package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lados;
		double medida;
		System.out.println("Digite o numero de lados do pol�gono regular");
		lados = Integer.parseInt(in.nextLine());
		System.out.println("Digite a medida do lado (em cm)");
		medida = Double.parseDouble(in.nextLine());
		
		if (lados == 3) {
			System.out.println("O pol�gono regular � um Tri�ngulo, com a medida dos lados de : "+medida+" cm.");
		}else if (lados == 4) {
			System.out.println("O pol�gono regular � um Quadrado, com a medida dos lados de : "+medida+" cm.");
		}else if (lados == 5) {
			System.out.println("O pol�gono regular � um Pent�gono, com a medida dos lados de : "+medida+" cm.");
		}else {
			System.out.println("Pol�gono Desconhecido");
		}
		
		in.close();
	}
}
