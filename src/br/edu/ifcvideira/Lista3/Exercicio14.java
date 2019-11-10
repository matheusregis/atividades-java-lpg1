/*
 * 14 (V�deo Aula 6) - Em um campeonato de futebol, cada time tem uma lista oficial
de 23 jogadores. Cada time prepara uma lista contendo o peso e a idade de cada
um dos seus jogadores. Os 40 times que participam do torneio enviam essas listas
para o CPD da confedera��o. Fa�a um Programa que apresente as seguintes
informa��es:
� peso m�dio e a idade m�dia de cada um dos times;
� peso m�dio e a idade m�dia de todos os participantes
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
			 System.out.println("A m�dia  de idade do time "+(times+1)+" �: "+(mediaIdadeTime/jog));
			 System.out.println("A m�dia  de peso do time "+(times+1)+" �: "+(mediaIdadeTime/jog));
			 
			 mediaIdadeTT += mediaIdadeTime;
			 mediaPesoTT += mediaPesoTime;
			 
		 }
		 
		 System.out.println("A m�dia de idade total no campeonato �: "+(mediaIdadeTT)/(jog*times));
		 System.out.println("A m�dia de peso total no campeonato �: "+(mediaPesoTT)/(jog*times));
		in.close();
	}

}
