/*
 * 1 � Fa�a um programa em JAVA que l� dois n�meros inteiros do teclado, testa se
o primeiro � menor que o segundo, se for imprime todos os n�meros do intervalo
entre eles.

 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int n1;
		int n2;
		System.out.println("Escreva o primeiro n�mero");
		n1 = Integer.parseInt(in.nextLine());
		System.out.println("Escreva o segundo n�mero");
		n2 = Integer.parseInt(in.nextLine());
		
		if (n1 < n2) {
			while (n1 < n2) {
				n1++;
				System.out.println(n1);
			}
		}else {
			System.out.println("N1 � maior que N2");
		}
		in.close();
	}

}
