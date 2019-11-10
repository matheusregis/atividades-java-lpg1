package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int vetor [] = {1,2,3,4,5};
		int i;
		int valor;
		System.out.println("Digite um valor: (0 À 4");
		valor = Integer.parseInt(in.nextLine());
		i = valor;
				
			if (i == 0) {
				System.out.println("O valor da posição do vetor é "+i+" , seu nome por extenso é zero");
			}else if (i == 1) {
				System.out.println("O valor da posição do vetor é "+i+" , seu nome por extenso é um");
			}else if (i == 2) {
				System.out.println("O valor da posição do vetor é "+i+" , seu nome por extenso é dois");
			}else if (i == 3) {
				System.out.println("O valor da posição do vetor é "+i+" , seu nome por extenso é três");
			}else if (i == 4) {
				System.out.println("O valor da posição do vetor é "+i+" , seu nome por extenso é quatro");
			}
		
		
		in.close();
	}

}
