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
		
		System.out.println("Digite a largura do cômodo:");
		l = Double.parseDouble(in.nextLine());
		System.out.println("Digite o comprimento do cômodo:");
		c = Double.parseDouble(in.nextLine());
		System.out.println("Digite a altura do cômodo:");
		h = Double.parseDouble(in.nextLine());
		
		comodo = l*c*h;
		System.out.println("O tamanho do cômodo em m³ é: "+comodo);
		
		azuleijos = comodo / 1.5;
		
		
		System.out.println("A Quantidade de Azuleijos necessárias para "+comodo+" m³ será de : "+azuleijos+" caixas");
		
		in.close();
	}

}