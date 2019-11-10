package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int vetor[] = new int[16];
		int aux;
		int i;

		Random r = new Random();
		
		for (i = 0; i < 16; i++) {
			vetor[i] = r.nextInt(50);
			System.out.println(vetor[i]);
		}
		
		for (i = 0; i < 8; i++) {
			aux = vetor[i+8];
			vetor[i+8] = vetor[i];
			vetor[i] = aux;
			
			
		}
		System.out.println("---------------------");
		System.out.println("Invertido");
		for (i = 0; i < 16; i++) {
			System.out.println(vetor[i]);
			
		}
		
		
		in.close();
	}

}
