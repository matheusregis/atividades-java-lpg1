/*
6 - Escreva um programa em JAVA para calcular e imprimir o número de
lâmpadas necessárias para iluminar um determinado cômodo de uma residência.
Dados de entrada: a potência da lâmpada utilizada (em watts), as dimensões
(largura e comprimento, em metros) do cômodo. Considere que a potência
necessária é de 18 watts por metro quadrado.

 */

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double lampada;
		double l;
		double c;
		double comodo;
		int qtdLampada;
		
		System.out.println("Digite a potência da lâmpada que será utilizada:");
		lampada = Double.parseDouble(in.nextLine());
		System.out.println("Digite a largura do cômodo:");
		l = Double.parseDouble(in.nextLine());
		System.out.println("Digite o comprimento do cômodo:");
		c = Double.parseDouble(in.nextLine());
		
		comodo = l*c;
		System.out.println("O tamanho do cômodo em m² é: "+comodo);
		
		qtdLampada =(int) (comodo * 18 / lampada);
		
		System.out.println("A Quantidade de Lâmpadas necessárias para "+comodo+"m² será: "+qtdLampada);
		
		in.close();
	}

}
