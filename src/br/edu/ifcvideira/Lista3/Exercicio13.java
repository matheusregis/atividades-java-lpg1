/*
 * 13 (V�deo Aula 5) - Fa�a um algoritmo que leia o c�digo do jogador (1 ou 2) que
ganhou o ponto em uma partida de t�nis de mesa, e responda quem ganha a
partida. A partida chega ao final se um dos jogadores chega a 11 pontos e a
diferen�a de pontos entre os jogadores � maior ou igual a dois. Caso contr�rio,
ganha aquele que, com mais de 11 pontos, consiga colocar uma vantagem de dois
pontos sobre o advers�rio. 
 */
package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int jog1 = 0;
		int jog2 = 0;
		int ponto = 0;
		
		do {
			System.out.println("Quem marcou o ponto\n"
					+ "1 - Jogador 1\n"
					+ "2 - Jogador 2");
			ponto = Integer.parseInt(in.nextLine());
			
			if (ponto==1) {
				jog1++;
			}else if (ponto==2) {
				jog2++;
			}else {
				System.out.println("Ponto mal fornecido");
			}
		}while((jog1<11) || (jog1<(jog2+2)) && ((jog2<11) || (jog2<(jog1+2))));
		
		System.out.println("Placar Final:\n"
				+ "Jogador 1:"+jog1+"\n"
					+ "Jogador 2:"+jog2);
		
		if (jog1 > jog2) {
			System.out.println("Jogador 1 ganhou!!!");
		}else {
			System.out.println("Jogador 2 ganhou!!!");
		}
		
		in.close();
		
	}

}
