/*
 * 6 - Implemente um programa que solicite ao usu�rio uma frase. Apresente a frase
informada pelo usu�rio substituindo todos os caracteres �a� por �*�. Ex: Frase: Ana
foi a boate.
Exiba: An* foi * bo*te. Dica: utilize os m�todos da classe StringBuilder
 */
package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String frase = "";
		System.out.println("Digite a frase");
		frase = String.valueOf(in.nextLine());
		
		frase = frase.replace("a", "*");
		frase = frase.replace("A", "*");
		frase = frase.replace("�", "*");
		frase = frase.replace("�", "*");
		frase = frase.replace("�", "*");
		frase = frase.replace("�", "*");
		
		System.out.println(frase);
		
	}

}
