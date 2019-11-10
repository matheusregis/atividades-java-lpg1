/*
2 - As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia,
e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa em JAVA
que leia o número de maçãs compradas, calcule e escreva o valor total da
compra.
 */
package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maca;
		double preco;
		System.out.println("até 12 maçãs R$0,30 cada, acima de 12, R$0,25");
		System.out.println("Escreva a quantidade de maçãs que você deseja:");
		maca = Integer.parseInt(in.nextLine());
		
		if ((maca > 0 ) && (maca < 12)){
			preco = maca * 0.30;
			System.out.println("O valor total da compra é: "+preco);
		}else if (maca >=12) {
			preco = maca * 0.25;
			System.out.println("O valor total da compra é: "+preco);
		}else {
			System.out.println("O Número de maçãs deve ser maior que 0 para  0 cálculo funcionar");
		}
		in.close();
	}

}
