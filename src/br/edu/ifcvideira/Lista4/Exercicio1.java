package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int[5];
		int i;
		
		for (i=0; i<5; i++) {
			System.out.println("Digite um valor para a posição "+(i+1));
			vetor[i] = Integer.parseInt(in.nextLine());
			
		}
		
		for(i=4; i>=0; i--) {
			System.out.println("Valor na posição "+(i+1)+" é: "+vetor[i]);
		}
		
		in.close();
	}

}
