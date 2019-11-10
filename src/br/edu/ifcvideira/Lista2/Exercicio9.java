/*
 * 9 (Vídeo Aula 2) - Ler 3 valores e escrever a soma dos 2 maiores (Considerando
valores distintos).

 */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int soma;
		System.out.println("Digite o Primeiro Valor");
		n1 = Integer.parseInt(in.nextLine());
		System.out.println("Digite o Segundo Valor");
		n2 = Integer.parseInt(in.nextLine());
		System.out.println("Digite o Terceiro Valor");
		n3 = Integer.parseInt(in.nextLine());	
		
		if ((n1 > n2) && (n1 > n3) && (n2 > n3)) {
			soma = n1 + n2;
			System.out.println("Os dois maiores valores são: "+n1+" e "+n2);
			System.out.println("A soma dos valores é: "+soma);
			
		}else if ((n1 > n2) && (n1 > n3) && (n3 > n2)) {
			soma = n1 + n3;
			System.out.println("Os dois maiores valores são: "+n1+" e "+n3);
			System.out.println("A soma dos valores é: "+soma);
		}else if ((n2 > n1) && (n2 > n3) && (n3 > n1)) {
			soma = n2 + n3;
			System.out.println("Os dois maiores valores são: "+n2+" e "+n3);
			System.out.println("A soma dos valores é: "+soma);
		}else if ((n1 == n3) && (n1 == n2)){
			System.out.println("Os três valores são iguais");
		}
		in.close();
	}

}
