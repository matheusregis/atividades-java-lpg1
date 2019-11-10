package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		int x;
		int y;
		double total;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		x = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o segundo número:");
		y = Integer.parseInt(in.nextLine());
		
		total =(double) x / y;
		System.out.println("O valor do quociente é: "+total);
		
		total = x % y;
		System.out.println("O resto da divisão é: "+total);
		
		in.close();
	}

}
