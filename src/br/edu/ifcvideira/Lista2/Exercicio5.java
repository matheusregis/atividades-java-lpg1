/*
 * 5 - Escreva um programa que leia as medidas dos lados de um triângulo e
escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
- Triângulo Equilátero: possui os 3 lados iguais;
- Triângulo Isóscele: possui 2 lados iguais;
- Triângulo Escaleno: possui 3 lados diferentes.
 */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double l1;
		double l2;
		double l3;
		System.out.println("Digite a medida do lado 1 (em cm)");
		l1 = Double.parseDouble(in.nextLine());
		System.out.println("Digite a medida do lado 2 (em cm)");
		l2 = Double.parseDouble(in.nextLine());
		System.out.println("Digite a medida do lado 3 (em cm)");
		l3 = Double.parseDouble(in.nextLine());
		
		if ((l1 == l2) && (l1 == l3) && (l2 == l3)) {
			System.out.println("O triângulo é Equilátero");
		}else if ((l1 == l2) || (l1 == l3) || (l2 == l3)) {
			System.out.println("O triângulo é Isósceles");
		}else if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
			System.out.println("O triângulo é Escaleno");
		}
		in.close();
	}

}
