package br.edu.ifcvideira.Lista6;

import java.util.Scanner;

public class MainContador {

	public static void main(String[] args) {
		Contador contador = new Contador();
		int valor;
		int op;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		valor = Integer.parseInt(in.nextLine());
		
		contador.setNumero(valor);
		System.out.println(contador.getNumero());
		for(;;) {
		System.out.println("Menu:\n"
				+ "1 - Incrementar Numero\n"
				+ "2 - Decrementar Numero\n"
				+ "3 - Sair");
		op = Integer.parseInt(in.nextLine());
		
		
			if (op == 1) {
				contador.incrementaNumero();
				System.out.println(contador.getNumero());
			}else if (op == 2) {
				contador.desfazIncrementoNumero();
				System.out.println(contador.getNumero());
			}else if (op == 3) {
				break;
			}else {
				System.exit(0);
			}
		}
		
	}

}
