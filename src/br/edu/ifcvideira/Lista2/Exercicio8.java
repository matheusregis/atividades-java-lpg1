/*
 * 8 - Digitado um n�mero inteiro entre 0 e 100, informar o quanto ele est� distante
de um determinado n�mero chave, que deve ser solicitado no in�cio do algoritmo.
Exibir no final o n�mero chave, n�mero informado e a resposta. Caso o n�mero
chave ou o n�mero a calcular seja menor que 0 ou maior que 100 informar que �
inv�lido e encerrar o algoritmo. Ex.: N�mero chave=20, n�mero digitado=15,
resposta=5. N�mero chave=17, n�mero digitado=20, resposta=3. A resposta
dever� ser sempre um n�mero positivo.

 */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero;
		int chave;
		int resposta;
		
		System.out.println("Digite um n�mero de 0 a 100");
		numero = Integer.parseInt(in.nextLine());
		System.out.println("Digite o N�mero Chave (entre 0 e 100)");
		chave = Integer.parseInt(in.nextLine());
		if ((numero < 0) || (numero > 100)){
			System.out.println("Valor Inv�lido!");
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
