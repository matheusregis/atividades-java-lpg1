/*
 * Matrizes
13 - Fa�a um programa em JAVA que declare uma matriz 10X10 posi��es e
preencha os elementos com os valores da soma do �ndice para aquele elemento,
de forma que, por exemplo, o elemento [7][9] valha 16. E uma outra tamb�m
10X10 que seja completada pela multiplica��o de i e j. Ex: [7][8] = 56.
 */
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
		//impress�o da matriz soma
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				System.out.print(soma[i][j]+"   ");
				
			}
			System.out.println();
		}
		
		
		System.out.println("Matriz multiplica��o");
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				multiplicacao[i][j] = i * j;
				
			}
		}
		//impress�o da matriz soma
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				System.out.print(multiplicacao[i][j]+"   ");
				
			}
			System.out.println();
		}
		
	}

}
