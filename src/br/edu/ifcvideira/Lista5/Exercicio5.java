package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String frase = "";
		System.out.println("Digite a frase");
		frase = String.valueOf(in.nextLine());
		
		String [] st1 = frase.split(" ");
		for(int i = st1.length-1; i>=0; i--) {
		System.out.print(st1[i] + " ");
		}
	}
}
