/*
 * 5 - Fa�a um programa em JAVA que leia um vetor de 40 posi��es e atribua valor 0
para todos os elementos que possu�rem valores negativos.
 */
package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int [40];
		int i;
		Random r = new Random();
		
		for (i = 0; i < 40; i++) {
			System.out.println("Digite um n�mero");
			vetor[i] = Integer.parseInt(in.nextLine());
			
			if (vetor[i] < 0 ) {
				vetor[i] = 0;
			}
			
		}
		for (i = 0; i < 40; i++) {
			System.out.println(vetor[i]);
		}
		
		
		
		in.close();
	}

}
