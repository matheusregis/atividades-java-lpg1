/*
 * 8 - Fa�a um programa em JAVA que apresente quatro op��es: (a) consulta saldo,
(b) saque, (c) dep�sito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque
ou dep�sito o valor do saldo deve ser atualizado e apresentado na tela.
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int saldo = 0;
		int saque = 0;
		int deposito = 0;
		String operacao = null;
		do{

			System.out.println("\n a - Consultar Saldo\n"
					+ " b - Deposito\n"
					+ " c - Saque\n"
					+ " d - Sair\n");
			operacao = String.valueOf(in.nextLine());
			
	
			switch(operacao){
			case "a":
				System.out.println("Operacao Desejada: Saldo\n");
				System.out.println("Saldo......R$"+saldo+" reais.");
				break;
	
			case "b":
				System.out.println("Operacao Desejada: Deposito\n");
				System.out.println(" Digite o Valor a Ser Depositado: R$");
				deposito = Integer.parseInt(in.nextLine());
				saldo=saldo + deposito;
				System.out.println("Seu saldo �:R$"+saldo+" reais.");
				break;
	
			case "c":
				System.out.println("Operacao Desejada:Saque\n");
				System.out.println("Digite o Valor Solicitado: R$");
				saque = Integer.parseInt(in.nextLine());
	
				if (saque>saldo){
					System.out.println("Valor Solicitado "+saque+" reais, � maior que o saldo dispon�vel que � R$"+saldo+" reais.");
					saque=0;
				}
				else if (saque<=saldo){
					saldo=saldo-saque;
					System.out.println("Seu novo Saldo �: R$ "+saldo+" reais.");
				}
				break;
	
			case "d":   
				System.out.println("Obrigado por Utilizar nosso servi�o ");
				System.exit(0);
			}
		}while(true);
	}
}
