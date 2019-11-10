/*
 * 2 – Faça um programa em JAVA que leia um vetor de 12 posições e em seguida
ler também dois valores X e Y quaisquer correspondentes a duas posições no
vetor. Ao final seu programa deverá escrever a soma dos valores encontrados nas
respectivas posições X e Y.

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
		
		System.out.println("Qual Posição para X:(0 até 11)");
		posX = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual Posição para Y:(0 até 11)");
		posY = Integer.parseInt(in.nextLine());
		
		for (i = 0; i<12; i++) {
			vetor[i] = r.nextInt(50);
			System.out.println(vetor[i]);
	
		}
	
		
		System.out.println("O valor da posição X: "+vetor[posX]);
		System.out.println("O valor da posição Y: "+vetor[posY]);
		soma = vetor[posX]+vetor[posY];
		System.out.println("A soma dos Valores da Posição X e Y: "+soma);
		
		
		in.close();
	}
}
