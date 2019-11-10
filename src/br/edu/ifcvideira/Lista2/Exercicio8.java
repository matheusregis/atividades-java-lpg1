package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero;
		int chave;
		int resposta;
		
		System.out.println("Digite um número de 0 a 100");
		numero = Integer.parseInt(in.nextLine());
		System.out.println("Digite o Número Chave (entre 0 e 100)");
		chave = Integer.parseInt(in.nextLine());
		if ((numero < 0) || (numero > 100)){
			System.out.println("Valor Inválido!");
			System.exit(0);
		}
		
		if (chave >= numero) {
			resposta = chave - numero;
			System.out.println("Valor Chave: "+chave);
			System.out.println("Valor Digitado: "+numero);
			System.out.println("Resposta: "+resposta);
			
		}else if (numero > chave) {
			resposta = numero - chave;
			System.out.println("Valor Chave: "+chave);
			System.out.println("Valor Digitado: "+numero);
			System.out.println("Resposta: "+resposta);
			
		}			
		in.close();
	}
}
