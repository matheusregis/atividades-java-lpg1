/*
 * 2 - Fa�a um programa em JAVA que l� um n�mero real do teclado e calcula o
fatorial deste n�mero. (ex: 5! � igual a 5 * 4 * 3 * 2 * 1 = 120).
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n1;
		int i;
		int fat = 1;
		System.out.println("Digite um n�mero");
		n1 = Integer.parseInt(in.nextLine());
		
		for (i=2; i<=n1; i++) {
			fat*=i;
			
			System.out.println( "O fatorial de " + n1 + " � igual a " + fat );
		}
		
		in.close();
	}

}
