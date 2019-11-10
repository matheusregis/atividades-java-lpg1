/*
2 - Faça um programa em Java que lê três números reais do teclado e apresenta
na tela a média destes números.
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
		
		System.out.println("Escreva o Primeiro Número: ");
		x = Double.parseDouble(in.nextLine());
		System.out.println("Escreva o Segundo Número: ");
		y = Double.parseDouble(in.nextLine());
		System.out.println("Escreva o Terceiro Número: ");
		z = Double.parseDouble(in.nextLine());
		
		media = (x + y + z) / 3;
		
		System.out.println("A média dos números é: "+media);
		
		in.close();
		
	}

}
