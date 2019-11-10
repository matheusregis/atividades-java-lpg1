/*
3 - Tendo como entrada a altura e o sexo (codificado da seguinte forma:
1:feminino 2:masculino) de uma pessoa, construa um programa que calcule e
imprima seu peso ideal, utilizando as seguintes fórmulas:
- para homens: (72.7 * Altura) – 58
- para mulheres: (62.1 * Altura) – 44.7
 */
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
