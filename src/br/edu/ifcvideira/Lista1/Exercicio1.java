package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		int x;
		int y;
		double total;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero:");
		x = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o segundo n�mero:");
		y = Integer.parseInt(in.nextLine());
		
		total =(double) x / y;
		System.out.println("O valor do quociente �: "+total);
		
		total = x % y;
		System.out.println("O resto da divis�o �: "+total);
		
		in.close();
	}

}
