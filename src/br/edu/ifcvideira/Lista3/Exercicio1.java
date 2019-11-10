package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int n1;
		int n2;
		System.out.println("Escreva o primeiro número");
		n1 = Integer.parseInt(in.nextLine());
		System.out.println("Escreva o segundo número");
		n2 = Integer.parseInt(in.nextLine());
		
		if (n1 < n2) {
			while (n1 < n2) {
				n1++;
				System.out.println(n1);
			}
		}else {
			System.out.println("N1 é maior que N2");
		}
		in.close();
	}

}
