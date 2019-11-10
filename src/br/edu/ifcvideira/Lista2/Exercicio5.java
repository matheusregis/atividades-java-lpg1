/*
 * 5 - Escreva um programa que leia as medidas dos lados de um tri�ngulo e
escreva se ele � Equil�tero, Is�sceles ou Escaleno. Sendo que:
- Tri�ngulo Equil�tero: possui os 3 lados iguais;
- Tri�ngulo Is�scele: possui 2 lados iguais;
- Tri�ngulo Escaleno: possui 3 lados diferentes.
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
			System.out.println("O tri�ngulo � Equil�tero");
		}else if ((l1 == l2) || (l1 == l3) || (l2 == l3)) {
			System.out.println("O tri�ngulo � Is�sceles");
		}else if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
			System.out.println("O tri�ngulo � Escaleno");
		}
		in.close();
	}

}
