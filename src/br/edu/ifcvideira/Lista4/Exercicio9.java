/*
 * 9 - Fa�a um programa em JAVA que ir� ler 35 sal�rios e 35 c�digos de
identifica��o de empregados. Estes dados devem ficar armazenados em vetores
diferentes. Ap�s lidos os 35 dados pares de dados, mostrar quais s�o os c�digos
dos funcion�rios que ganham acima de R$ 880,00.

 */
package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double vetorSalario[] = new double [35];
		int vetorCodigo[] = new int [35];
		int i;
		for (i = 0; i < 35; i++) {
			vetorCodigo[i] = i+1;
			System.out.println("Digite seu Sal�rio:");
			vetorSalario[i] = Double.parseDouble(in.nextLine());
		}
		for (i = 0; i < 35; i++) {
			if (vetorSalario[i] >= 880) {
				System.out.println("O sal�rio do Funcion�rio "+vetorCodigo[i]+" �: R$"+vetorSalario[i]);
			}
		}
		
		
	}

}
