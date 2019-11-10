/*
10 - Faça um algoritmo para calcular a área superficial de um
cilindro (2*pi*r*h)
 */

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		double r;
		double h;
		double total;
		System.out.println("Escreva o valor do Raio");
		r = Double.parseDouble(in.nextLine());
		System.out.println("Escreva o valor da Altura");
		h = Double.parseDouble(in.nextLine());
		
		total = 2 * Math.PI*r*h;
		
		System.out.println("O Valor da Área Superficial é: "+total);
		
		in.close();
	}

}
