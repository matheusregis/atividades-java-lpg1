/*
4 - Escreva um programa para ler o número de lados de um polígono regular e a
medida do lado (em cm). Calcular e imprimir o seguinte:
- Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da
Área;
- Se o número de lados for igual a 4 escrever QUADRADO e o valor da
sua área;
- Se o número de lados for igual a 5 escrever PENTÁGONO
 */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lados;
		double medida;
		System.out.println("Digite o numero de lados do polígono regular");
		lados = Integer.parseInt(in.nextLine());
		System.out.println("Digite a medida do lado (em cm)");
		medida = Double.parseDouble(in.nextLine());
		
		if (lados == 3) {
			System.out.println("O polígono regular é um Triângulo, com a medida dos lados de : "+medida+" cm.");
		}else if (lados == 4) {
			System.out.println("O polígono regular é um Quadrado, com a medida dos lados de : "+medida+" cm.");
		}else if (lados == 5) {
			System.out.println("O polígono regular é um Pentágono, com a medida dos lados de : "+medida+" cm.");
		}else {
			System.out.println("Polígono Desconhecido");
		}
		
		in.close();
	}
}
