/*
 * 1 � Fa�a um programa em JAVA que cria um vetor com 5 elementos inteiros, l� 5
n�meros do teclado, armazena os n�meros no vetor e imprime o vetor na ordem
inversa.
 */
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int[5];
		int i;
		
		for (i=0; i<5; i++) {
			System.out.println("Digite um valor para a posi��o "+(i+1));
			vetor[i] = Integer.parseInt(in.nextLine());
			
		}
		
		for(i=4; i>=0; i--) {
			System.out.println("Valor na posi��o "+(i+1)+" �: "+vetor[i]);
		}
		
		in.close();
	}

}
