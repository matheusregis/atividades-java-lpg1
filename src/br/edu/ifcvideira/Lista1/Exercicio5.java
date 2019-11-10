package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int f;
		double c;
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		f = Integer.parseInt(in.nextLine());
		
		c =(double) (f-32)/1.8;
		System.out.println("O valor da conversão de Fahrenheit para Celsius é: "+c);
		
		in.close();
	}

}
