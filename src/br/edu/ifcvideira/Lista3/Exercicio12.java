/*
 * 12 (V�deo Aula 4) - A prefeitura de uma cidade fez uma pesquisa entre seus
habitantes, coletando dados sobre o n�mero de filhos e sal�rio. A prefeitura deseja
saber:
a) m�dia do sal�rio da popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at� R$1000,00.
O final da leitura de dados se dar� com a entrada de um sal�rio negativo. 
 */
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
			System.out.println("Qual o sal�rio:");
			salario = Double.parseDouble(in.nextLine());
			
			if(salario<0) {
				break;
			}
			System.out.println("Qual o n�mero de filhos:");
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
		System.out.println("A m�dia de sal�rios entre as pessoas �: "+(media/cont));
		System.out.println("A m�dia do n�mero de filhos �:"+(mediaFilhos/cont));
		System.out.println("O maior sal�rio do grupo �:"+maiorSalario);
		System.out.println("O percentual de pessoas com sal�rio at� R$1000 �:"+(salMenor/cont*100)+"%.");
		
		in.close();
	}
}
