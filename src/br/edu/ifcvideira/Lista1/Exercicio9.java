package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double salario;
		int horasTrabalhadas;
		double salarioTotal;
		double descontoInss;
		double descontoSindicato;
		double descontoIR;
		double descontoTotal;
		System.out.println("Quanto voc� ganha por hora?");
		salario = Double.parseDouble(in.nextLine());
		System.out.println("Quantas horas voc� trabalha por m�s?");
		horasTrabalhadas = Integer.parseInt(in.nextLine());
		
		salarioTotal = salario*horasTrabalhadas;
		descontoInss = salarioTotal*8/100;
		descontoSindicato = salarioTotal*5/100;
		descontoIR = salarioTotal*11/100;
		descontoTotal = descontoInss+descontoSindicato+descontoIR;
		
		System.out.println("Seu Sal�rio Bruto: "+salarioTotal+" Reais.");
		System.out.println("Desconto ao INSS (8%): "+descontoInss+" Reais.");
		System.out.println("Desconto ao Sindicato (5%): "+descontoSindicato+" Reais.");
		System.out.println("Desconto ao Imposto de Renda(11%): "+descontoIR+" Reais.");
		System.out.println("Desconto Total: "+descontoTotal+" Reais.");
		System.out.println("Sal�rio L�quido: "+(salarioTotal-descontoTotal)+" Reais.");
		
		
		in.close();
	}
}
