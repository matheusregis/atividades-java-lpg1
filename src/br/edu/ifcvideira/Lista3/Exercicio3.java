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
		
		System.out.println("A média de idade é : "+(media/qtdIdade));
		System.out.println("A quantidade de idades lidas é: "+qtdIdade);
	in.close();
	}

}
