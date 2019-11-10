/*
 * 5 - Implemente um programa que solicite ao usuário uma frase e inverta a ordem
das palavras. Ex: Frase: aula até meio dia. Exiba: dia meio até aula. Monte a nova
String, utilizando a classe StringBuilder e o seu método append().
 */
package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String frase = "";
		System.out.println("Digite a frase");
		frase = String.valueOf(in.nextLine());
		
		String [] st1 = frase.split(" ");
		for(int i = st1.length-1; i>=0; i--) {
		System.out.print(st1[i] + " ");
		}
	}
}
