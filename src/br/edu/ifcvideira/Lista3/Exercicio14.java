/*
 * 14 (Vídeo Aula 6) - Em um campeonato de futebol, cada time tem uma lista oficial
de 23 jogadores. Cada time prepara uma lista contendo o peso e a idade de cada
um dos seus jogadores. Os 40 times que participam do torneio enviam essas listas
para o CPD da confederação. Faça um Programa que apresente as seguintes
informações:
• peso médio e a idade média de cada um dos times;
• peso médio e a idade média de todos os participantes
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int jog = 0;
		int times = 0;
		int idade;
		double peso;
		double mediaIdadeTime = 0;
		double mediaPesoTime = 0;
		double mediaIdadeTT = 0;
		double mediaPesoTT = 0;
		
		 for (times=0; times < 40; times++) {
			 System.out.println("Dados do time:"+(times+1));
			 for(jog=0; jog < 23; jog++) {
				 System.out.println("Digite a idade do jogador "+(jog+1));
				 idade = Integer.parseInt(in.nextLine());
				 
				 System.out.println("Digite o peso do jogador "+(jog+1));
				 peso = Double.parseDouble(in.nextLine());
				 
				 mediaIdadeTime += idade;
				 mediaPesoTime += peso;
				 
			 }
			 System.out.println("A média  de idade do time "+(times+1)+" é: "+(mediaIdadeTime/jog));
			 System.out.println("A média  de peso do time "+(times+1)+" é: "+(mediaIdadeTime/jog));
			 
			 mediaIdadeTT += mediaIdadeTime;
			 mediaPesoTT += mediaPesoTime;
			 
		 }
		 
		 System.out.println("A média de idade total no campeonato é: "+(mediaIdadeTT)/(jog*times));
		 System.out.println("A média de peso total no campeonato é: "+(mediaPesoTT)/(jog*times));
		in.close();
	}

}
