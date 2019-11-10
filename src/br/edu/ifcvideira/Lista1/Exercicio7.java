/*
7 - Escreva um programa em JAVA para ler as dimens�es de uma cozinha
retangular (comprimento, largura e altura), calcular e escrever a quantidade de
caixas de azulejos para se colocar em todas as suas paredes (considere que n�o
ser� descontada a �rea ocupada por portas e janelas). Cada caixa de azulejos
possui 1,5 m2.
 */

package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double l;
		double c;
		double h;
		double comodo;
		double azuleijos;
		
		System.out.println("Digite a largura do c�modo:");
		l = Double.parseDouble(in.nextLine());
		System.out.println("Digite o comprimento do c�modo:");
		c = Double.parseDouble(in.nextLine());
		System.out.println("Digite a altura do c�modo:");
		h = Double.parseDouble(in.nextLine());
		
		comodo = l*c*h;
		System.out.println("O tamanho do c�modo em m� �: "+comodo);
		
		azuleijos = comodo / 1.5;
		
		
		System.out.println("A Quantidade de Azuleijos necess�rias para "+comodo+" m� ser� de : "+azuleijos+" caixas");
		
		in.close();
	}

}