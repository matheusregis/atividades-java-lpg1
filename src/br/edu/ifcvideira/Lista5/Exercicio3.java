/*
 * 3 - Fa�a um programa que receba uma �nica String de n�meros inteiros
separados por �;�(ponto e v�rgula). Apresente o maior e o menor n�mero dessa
String.// Dica: utilize o m�todo split() da classe String.
 */
package br.edu.ifcvideira.Lista5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		String frase;
		String[] aux = null;
		int maior = 0;
		int menor = 999;
		int cont;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Digite os n�meros (Separados por ;)");
		frase = String.valueOf(in.nextLine());
		System.out.println("Digite a quantidade de valores digitados");
		cont = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < cont; i++) {
			aux = frase.split(";");
			System.out.println(aux[i]);
		
			int conv = Integer.parseInt(aux[i]);
			if (conv < menor) {
				menor = conv;
			}
			if (conv > maior) {
				maior = conv;
			}
		}
		System.out.println("Maior Valor:"+maior);
		System.out.println("Menor Valor:"+menor);
	}

}
