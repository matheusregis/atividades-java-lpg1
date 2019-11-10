/*
1 – Escreva um programa em JAVA que verifique a validade de uma senha
fornecida pelo usuário. A senha válida é o número 1234. Devem ser impressas as
seguintes mensagens:
ACESSO PERMITIDO caso a senha seja válida.
ACESSO NEGADO caso a senha seja inválida.

 */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int senha;
		
		System.out.println("Digite sua Senha:");
		senha = Integer.parseInt(in.nextLine());
		System.out.println(senha);
		if (senha != 1234){
			System.out.println("Acesso Negado");			
		}else {
			System.out.println("Acesso Permitido, Bem vindo!");
		}
		
		in.close();
	}

}
