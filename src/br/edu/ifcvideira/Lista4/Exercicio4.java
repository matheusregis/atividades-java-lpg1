/*
 * 4 - Faça um programa em JAVA que leia um vetor de 20 posições e em seguida
um valor X qualquer. Seu programa devera fazer uma busca do valor de X no
vetor lido e informar a posição(ões) em que foi encontrado ou se não foi
encontrado.
 */
package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int vetor[] = new int[20];
		int x;
		int i;
		Random r = new Random();
		
		System.out.println("Digite um número de 0 a 50");
		x = Integer.parseInt(in.nextLine());
		
		
		for (i = 0; i < 20; i++) {
			vetor[i] = r.nextInt(50);
			System.out.println(vetor[i]);
		}
		
		for (i = 0; i < 20; i++) {
			if (x == vetor[i]) {
				System.out.println("O valor "+x+" foi encontrado na posição "+i+" do vetor");
			}else {
				System.out.println("Não foi encontrado o valor "+x+" na posição "+i+" do vetor");
			}
		}
		
		
		in.close();
	}

}
