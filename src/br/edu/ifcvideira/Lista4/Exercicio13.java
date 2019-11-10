package br.edu.ifcvideira.Lista4;

public class Exercicio13 {
	public static void main(String[] args) {
		int soma[][] = new int[10][10];
		int multiplicacao[][] = new int[10][10];
		int i;
		int j;
		
		
		System.out.println("Matriz Soma");
		
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				soma[i][j] = i + j;
				
			}
		}
		//impressão da matriz soma
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				System.out.print(soma[i][j]+"   ");
				
			}
			System.out.println();
		}
		
		
		System.out.println("Matriz multiplicação");
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				multiplicacao[i][j] = i * j;
				
			}
		}
		//impressão da matriz soma
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				System.out.print(multiplicacao[i][j]+"   ");
				
			}
			System.out.println();
		}
		
	}

}
