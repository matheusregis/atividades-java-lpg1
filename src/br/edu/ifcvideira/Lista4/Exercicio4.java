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
		
		System.out.println("Digite um n�mero de 0 a 50");
		x = Integer.parseInt(in.nextLine());
		
		
		for (i = 0; i < 20; i++) {
			vetor[i] = r.nextInt(50);
			System.out.println(vetor[i]);
		}
		
		for (i = 0; i < 20; i++) {
			if (x == vetor[i]) {
				System.out.println("O valor "+x+" foi encontrado na posi��o "+i+" do vetor");
			}else {
				System.out.println("N�o foi encontrado o valor "+x+" na posi��o "+i+" do vetor");
			}
		}
		
		
		in.close();
	}

}
