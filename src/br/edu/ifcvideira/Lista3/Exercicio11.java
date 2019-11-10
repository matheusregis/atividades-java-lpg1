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
		System.out.println("Digite o valor que queira sacar (Notas Disponíveis: 50, 10, 5, 2)");
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
			
			System.out.println("Seu Saldo Disponível é: "+saque+" real.");
		}
		
		in.close();
	}
}
