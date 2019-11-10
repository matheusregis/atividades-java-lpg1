/*
 * 11 - Um caixa eletr�nico opera com notas de 50, 10, 5 e 2. Como medida de
seguran�a, a cada vez que o cliente deseja sacar dinheiro, o valor � dado de
forma a fornecer um pequeno volume de notas (supondo que o cliente sempre
esteja dentro do seu limite).
Esta medida � feita para que a quantidade sacada n�o �fa�a muito volume�
quando guardada pelo cliente. Por exemplo, se o cliente quiser sacar R$166,00
n�o s�o dadas 83 notas de 2; s�o dadas 3 notas de 50, 1 nota de 10 e 3 notas de
2. Assim, a resposta a ser impressa � 3 1 0 3.
Fa�a um programa em JAVA que leia a quantia (valor inteiro positivo) a ser
sacada e imprima as quantidades de notas de 50, 10, 5 e 2 a serem fornecidas
aos clientes.
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int saque;
		int cinquenta = 0;
		int dez = 0;
		int cinco = 0;
		int dois = 0;
		System.out.println("Digite o valor que queira sacar (Notas Dispon�veis: 50, 10, 5, 2)");
		saque = Integer.parseInt(in.nextLine());
		
		if (saque >=50) {
			do {
				saque = saque - 50;
				cinquenta++;
			}while (saque >=50);
		}
		if (saque >=10) {
			do {
				saque = saque - 10;
				dez++;
			}while (saque >=10);
		}
		if (saque >=5) {
			do {
				saque = saque - 5;
				cinco++;
			}while (saque >=5);
		}
		if (saque >=2) {
			do {
				saque = saque - 2;
				dois++;
			}while (saque >=2);
		}
		System.out.println("Foram sacadas a quantidade de notas de: \n"
				+ "Cinquenta: "+cinquenta+"\n"
				+ "Dez: "+dez+"\n"
				+ "Cinco: "+cinco+"\n"
				+ "Dois: "+dois);
		if (saque != 0) {
			
			System.out.println("Seu Saldo Dispon�vel �: "+saque+" real.");
		}
		
		in.close();
	}
}
