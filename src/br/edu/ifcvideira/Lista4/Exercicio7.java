/*
 * 7 - Determinada empresa vende 10 artigos diferentes. Para cada artigo, a
empresa o identifica com um c�digo num�rico e o pre�o de venda. Fa�a um
algoritmo para exibir o c�digo e o pre�o dos 3 artigos mais caros da empresa.
 */
package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double valor [] = new double [10];
		int codigo [] = new int [10];
		Random r = new Random();
		int i;
		int j;
		double aux;
		int auxCod;
		
		for (i=0; i<10; i++) {
			valor[i] = r.nextInt(50);
			codigo[i] = r.nextInt(1000);
		}
		//m�todo bolha de ordena��o
		for(j=0; j<10; j++) {
			
			for (i=0;i<9;i++) {
				if (valor[i] < valor[i+1]) {
					aux = valor[i];
					auxCod = codigo[i];
					valor[i] = valor[i+1];
					codigo[i] = codigo[i+1];
					valor[i+1] = aux;
					codigo[i+1] = auxCod;
				}
			}
		}
		
		//impress�o
		for (i=0; i<10; i++) {
			System.out.println("C�digo: "+codigo[i]+" - Valor R$"+valor[i]);
		}
		in.close();
	}

}
