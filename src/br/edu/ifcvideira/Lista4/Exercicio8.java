package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int valor [] = new int [50];

		Random r = new Random();
		int i;
		int j;
		int aux;
		
		for (i=0; i<50; i++) {
			valor[i] = r.nextInt(50);
		}
		//método bolha de ordenação
		for(j=0; j<50; j++) {
			
			for (i=0;i<49;i++) {
				if (valor[i] == 0) {
					aux = valor[i];
					valor[i] = valor[i+1];
					valor[i+1] = aux;
				}
			}
		}
		
		//impressão
		for (i=0; i<50; i++) {
			System.out.println(valor[i]);
		}
		in.close();
	}
}
