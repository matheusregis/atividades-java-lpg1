package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double altura;
		int sexo;
		int contFeminino = 0;
		int contMasculino = 0;
		double maiorAltura = 0;
		double menorAltura = 999;
		double mediaAlturaF = 0;
		int porcentagemMasc;
		for(int i =1; i<=10; i++) {
			
		
			System.out.println("Digite a altura da pessoa "+i);
			altura = Double.parseDouble(in.nextLine());
			System.out.println("Digite Seu Sexo: 1 - Feminino, 2 - Masculino");
			sexo = Integer.parseInt(in.nextLine());
			
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			
			if (sexo == 1) {
				contFeminino++;
				mediaAlturaF+=altura;
			}else if (sexo == 2) {
				contMasculino++;
			}else {
				System.out.println("Favor digitar 1 - Feminino, 2 - Masculino");
				System.exit(0);
			}
			
		}
		porcentagemMasc = contMasculino*100/10;
		System.out.println("A maior Altura é: "+maiorAltura);
		System.out.println("A menor Altura é: "+menorAltura);
		System.out.println("A média de altura das mulheres é: "+mediaAlturaF/contFeminino);
		System.out.println("A porcentagem de Homens é de: "+porcentagemMasc+"%.");
		in.close();
	}

}
