/*
 * 3 - Fa�a um programa em JAVA que leia um n�mero indeterminado de idades. A
�ltima idade lida, que n�o entrar� nos c�lculos, dever� ser igual a zero. Ao final
programa dever� escrever quantas idades foram lidas, calcular e escrever a m�dia
de idade desse grupo de idades.

 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade = 1;
		int media = 0;
		int cont = 0;
		int qtdIdade=0;
		while (idade != 0) {
			
			System.out.println("Escreva sua idade");
			idade = Integer.parseInt(in.nextLine());
			cont++;
			qtdIdade = cont -1;
			media += idade;
		}
		
		System.out.println("A m�dia de idade � : "+(media/qtdIdade));
		System.out.println("A quantidade de idades lidas �: "+qtdIdade);
	in.close();
	}

}
