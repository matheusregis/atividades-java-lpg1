package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n1;
		int i;
		int fat = 1;
		System.out.println("Digite um número");
		n1 = Integer.parseInt(in.nextLine());
		
		for (i=2; i<=n1; i++) {
			fat*=i;
			
			System.out.println( "O fatorial de " + n1 + " é igual a " + fat );
		}
		
		in.close();
	}

}
