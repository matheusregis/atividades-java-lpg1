package br.edu.ifcvideira.Lista6;

import java.util.Scanner;

public class MainTrocaValores {
	public static void main(String[] args) {
		TrocaValores troca = new TrocaValores();
		int valor;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor de N1");
		valor = Integer.parseInt(in.nextLine());
		troca.setN1(valor);
		
		System.out.println("Digite o valor de N2");
		valor = Integer.parseInt(in.nextLine());
		troca.setN2(valor);
		
		System.out.println("Valor de N1: "+troca.getN1());
		System.out.println("Valor de N2: "+troca.getN2());
		
		troca.trocaValor();
		System.out.println("Valor Trocado N1: "+troca.getN1());
		System.out.println("Valor Trocado N2: "+troca.getN2());
		
		
		
	}

}
