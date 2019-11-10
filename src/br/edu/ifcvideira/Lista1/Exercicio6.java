/*
6 - Escreva um programa em JAVA para calcular e imprimir o n�mero de
l�mpadas necess�rias para iluminar um determinado c�modo de uma resid�ncia.
Dados de entrada: a pot�ncia da l�mpada utilizada (em watts), as dimens�es
(largura e comprimento, em metros) do c�modo. Considere que a pot�ncia
necess�ria � de 18 watts por metro quadrado.

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
		
		System.out.println("Digite a pot�ncia da l�mpada que ser� utilizada:");
		lampada = Double.parseDouble(in.nextLine());
		System.out.println("Digite a largura do c�modo:");
		l = Double.parseDouble(in.nextLine());
		System.out.println("Digite o comprimento do c�modo:");
		c = Double.parseDouble(in.nextLine());
		
		comodo = l*c;
		System.out.println("O tamanho do c�modo em m� �: "+comodo);
		
		qtdLampada =(int) (comodo * 18 / lampada);
		
		System.out.println("A Quantidade de L�mpadas necess�rias para "+comodo+"m� ser�: "+qtdLampada);
		
		in.close();
	}

}
