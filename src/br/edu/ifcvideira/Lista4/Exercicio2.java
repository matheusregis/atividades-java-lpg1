/*
 * 2 � Fa�a um programa em JAVA que leia um vetor de 12 posi��es e em seguida
ler tamb�m dois valores X e Y quaisquer correspondentes a duas posi��es no
vetor. Ao final seu programa dever� escrever a soma dos valores encontrados nas
respectivas posi��es X e Y.

 */
package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int vetor[] = new int [12];
		int i;
		int posX;
		int posY;
		int soma;
		
		Random r = new Random();
		
		System.out.println("Qual Posi��o para X:(0 at� 11)");
		posX = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual Posi��o para Y:(0 at� 11)");
		posY = Integer.parseInt(in.nextLine());
		
		for (i = 0; i<12; i++) {
			vetor[i] = r.nextInt(50);
			System.out.println(vetor[i]);
	
		}
	
		
		System.out.println("O valor da posi��o X: "+vetor[posX]);
		System.out.println("O valor da posi��o Y: "+vetor[posY]);
		soma = vetor[posX]+vetor[posY];
		System.out.println("A soma dos Valores da Posi��o X e Y: "+soma);
		
		
		in.close();
	}
}
