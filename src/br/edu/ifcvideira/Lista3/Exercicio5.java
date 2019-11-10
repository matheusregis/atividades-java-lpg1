package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
	        int intervalo = 1000;
	        int i;
	        int j;
	        for (i = 100; i < intervalo; i++) {
	            boolean ehPrimo = true;
	            for (j = 2; j <= i; j++) {
	                if (((i % j) == 0) && (j != i)) {
	                    ehPrimo = false;
	                    break;
	                }
	            }
	            if (ehPrimo) {
	                System.out.println(i);
	            }
	        }
		in.close();
	}
}
