package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio18 {
	public static void main(String[] args) {
		String resposta[][] = new String[100][10];
		String gabarito[] = new String[10];
		int pontuacao[] = new int[100];
		int i;
		int j;
		int x;
		Random r = new Random();
		
		
		//preenchimento das respostas
		
		for (i = 0; i < 100; i++) { //alunos
			for (j = 0; j < 10; j++) { //respostas
				x = r.nextInt(4);

				if (x==0) {
					resposta[i][j] = "a";
				}else if (x==1) {
					resposta[i][j] = "b";
				}else if (x==2) {
					resposta[i][j] = "c";
				}else {
					resposta[i][j] = "d";
				}			
			}
		}
		//preenchimento do gabarito
		for (i = 0; i < 10; i++) {
			x = r.nextInt(4);
			
			if (x==0) {
				gabarito[i] = "a";
			}else if (x==1) {
				gabarito[i] = "b";
			}else if (x==2) {
				gabarito[i] = "c";
			}else {
				gabarito[i] = "d";
			}
		}
		
		//verificação das respostas
		
		for (i = 0; i < 100; i++) {
			System.out.print("Aluno "+(i+1)+" - ");
			for (j = 0; j < 10; j++) {
				if (resposta[i][j].equals(gabarito[j])) {
					pontuacao[i]++;
				}
				System.out.print(resposta[i][j]+"  ");
				
			}
			System.out.println(" = "+pontuacao[i]);
		}
		
		//impressão do gabarito
		System.out.print("Gabarito - ");
		for (i = 0; i < 10; i++) {
			System.out.print(gabarito[i]+"  ");
		}
	}	
}
