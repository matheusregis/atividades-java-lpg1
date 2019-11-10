package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int numFilhos;
		double salario;
		double media = 0;
		double mediaFilhos = 0;
		double maiorSalario = 0;
		int salMenor = 0;
		int cont = 0;
		
		while(2>1) {
			System.out.println("Qual o salário:");
			salario = Double.parseDouble(in.nextLine());
			
			if(salario<0) {
				break;
			}
			System.out.println("Qual o número de filhos:");
			numFilhos = Integer.parseInt(in.nextLine());
			
			media += salario;
			mediaFilhos += numFilhos;
			
			if (maiorSalario < salario) {
				maiorSalario = salario;
				
			}
			
			if(salario < 1000) {
				salMenor++;
			}
			cont++;
			
		}
		System.out.println("A média de salários entre as pessoas é: "+(media/cont));
		System.out.println("A média do número de filhos é:"+(mediaFilhos/cont));
		System.out.println("O maior salário do grupo é:"+maiorSalario);
		System.out.println("O percentual de pessoas com salário até R$1000 é:"+(salMenor/cont*100)+"%.");
		
		in.close();
	}
}
