/*
2 - Fa�a um programa em Java que l� tr�s n�meros reais do teclado e apresenta
na tela a m�dia destes n�meros.
 */

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double x;
		double y;
		double z;
		double media;
		
		System.out.println("Escreva o Primeiro N�mero: ");
		x = Double.parseDouble(in.nextLine());
		System.out.println("Escreva o Segundo N�mero: ");
		y = Double.parseDouble(in.nextLine());
		System.out.println("Escreva o Terceiro N�mero: ");
		z = Double.parseDouble(in.nextLine());
		
		media = (x + y + z) / 3;
		
		System.out.println("A m�dia dos n�meros �: "+media);
		
		in.close();
		
	}

}
