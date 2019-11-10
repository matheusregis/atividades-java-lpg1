/*
 * 8 - Digitado um número inteiro entre 0 e 100, informar o quanto ele está distante
de um determinado número chave, que deve ser solicitado no início do algoritmo.
Exibir no final o número chave, número informado e a resposta. Caso o número
chave ou o número a calcular seja menor que 0 ou maior que 100 informar que é
inválido e encerrar o algoritmo. Ex.: Número chave=20, número digitado=15,
resposta=5. Número chave=17, número digitado=20, resposta=3. A resposta
deverá ser sempre um número positivo.

 */
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
