package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		int i;
		
		System.out.println("Digite um número");
		num = Integer.parseInt(in.nextLine());
		
		
		for (i = 1; i <=num ; i++) {				
				if (num % i == 0) {
					System.out.println(i);
				}			
		}
		in.close();
	}
}
