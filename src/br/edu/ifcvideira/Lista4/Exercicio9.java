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
