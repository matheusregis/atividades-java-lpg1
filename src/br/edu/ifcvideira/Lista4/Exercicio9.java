/*
 * 9 - Faça um programa em JAVA que irá ler 35 salários e 35 códigos de
identificação de empregados. Estes dados devem ficar armazenados em vetores
diferentes. Após lidos os 35 dados pares de dados, mostrar quais são os códigos
dos funcionários que ganham acima de R$ 880,00.

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
			System.out.println("Digite seu Salário:");
			vetorSalario[i] = Double.parseDouble(in.nextLine());
		}
		for (i = 0; i < 35; i++) {
			if (vetorSalario[i] >= 880) {
				System.out.println("O salário do Funcionário "+vetorCodigo[i]+" é: R$"+vetorSalario[i]);
			}
		}
		
		
	}

}
