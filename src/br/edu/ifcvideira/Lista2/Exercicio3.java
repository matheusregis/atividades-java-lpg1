package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double altura;
		int sexo;
		double peso;
		
		
		System.out.println("Digite a sua Altura");
		altura = Double.parseDouble(in.nextLine());
		System.out.println("Digite Seu sexo: 1 - Masculino, 2 - Feminino");
		sexo = Integer.parseInt(in.nextLine());
		
		if (sexo == 1) {
			peso = (72.7*altura)-58;
			System.out.println("Seu peso Ideal é: "+peso);
			
		}else if (sexo == 2) {
			peso = (62.1 *altura)-44.7;
			System.out.println("Seu peso Ideal é: "+peso);
		}else {
			System.out.println("Valor Sexo Incorreto");
		}
		in.close();
	}

}
