package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String teclado;
		String letra;
		int cont = 0;
		
		System.out.println("Digite uma letra:");
		letra = String.valueOf(in.nextLine());
		for (;;) {
			System.out.println("Digite uma letra: (x para finalizar)");
			teclado = String.valueOf(in.nextLine());
			
			if (teclado.equals("x")) {
				break;
			}else if (letra.equals(teclado)) {
				cont++;
			}
			
			letra = teclado;
		}
		in.close();
		System.out.println("Foram digitadas "+cont+" letras iguais consecutivas");
	
	}

}
	