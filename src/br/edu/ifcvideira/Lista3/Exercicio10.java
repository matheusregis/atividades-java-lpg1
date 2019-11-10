package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double massa;
		double massaInicial;
		int cont = 0;
		int minutos = 0;
		int horas = 0;
		int segundos;
		int calculo;
		System.out.println("Digite a massa inicial");
		massa = Double.parseDouble(in.nextLine());
		massaInicial = massa;
		do {
			massa = massa/2;
			cont++;
			
		}while (massa > 0.5);
		calculo = cont*50;
		
		horas = calculo / 3600;
		minutos =(calculo - (horas * 3600)) / 60;
		segundos = calculo - (horas * 3600) - (minutos * 60);
		
		System.out.println("Massa Inicial: "+massaInicial);
		System.out.println("Massa Final: "+massa);
		System.out.println("Quantidade de vezes dividido por 2: "+cont);
		System.out.println("O tempo foi de: "+horas+"h"+minutos+"min"+segundos+"s.");
		
		
		in.close();
	}

}
