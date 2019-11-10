package br.edu.ifcvideira.Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double comprimentoPista;
		int qtdVoltas;
		double consumo;
		double reabastecimento;
		double totalPista;
		double minimoLitros;
		System.out.println("Digite o comprimento da pista (em metros)");
		comprimentoPista = Double.parseDouble(in.nextLine());
		System.out.println("Digite a quantidade de voltas que a corrida possu�");
		qtdVoltas = Integer.parseInt(in.nextLine());
		System.out.println("Digite o n�mero de reabastecimentos desejados durante a corrida");
		reabastecimento = Integer.parseInt(in.nextLine());
		System.out.println("Qual o consumo do carro (em Km/L)");
		consumo = Double.parseDouble(in.nextLine());
		
		
		totalPista = (comprimentoPista * qtdVoltas) / 1000;
		minimoLitros = (double) totalPista/consumo/(reabastecimento+1);
		System.out.println("O Comprimento da Pista �: "+comprimentoPista+" metros.");
		System.out.println("A Quantidade de voltas da Corrida ser�: "+qtdVoltas+" voltas.");
		System.out.println("O Comprimento Total do Circu�to ser�: "+totalPista+" Quil�metros");
		System.out.println("A Estimativa desejada de reabastecimento �: "+df.format(minimoLitros));
		
		in.close();
	}
}
