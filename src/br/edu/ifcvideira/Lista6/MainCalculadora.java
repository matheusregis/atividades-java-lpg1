package br.edu.ifcvideira.Lista6;

import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {

		Calculadora ca = new Calculadora();
		int valor;

		int num1;
		int num2;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite o valor do número 1");
		valor = Integer.parseInt(in.nextLine());
		
		ca.setNumero1(valor);
		
		System.out.println("Digite o valor do número 2");
		valor = Integer.parseInt(in.nextLine());
		
		ca.setNumero2(valor);
		
		System.out.println("Digite outro valor para o número 1");
		num1 = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o valor do número 2");
		num2 = Integer.parseInt(in.nextLine());
		
		System.out.println(ca.retornaSomaAtributos());
		System.out.println(ca.retornaMultiplicaAtributos());
		ca.insereValor(num1, num2);
		
		
	

	}

}
