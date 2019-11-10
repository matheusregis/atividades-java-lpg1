package br.edu.ifcvideira.Lista6;

import java.util.Scanner;

public class MainContaDeLuz {

	public static void main(String[] args) {
		ContaDeLuz conta = new ContaDeLuz();
		double salario;
		double aux;
		int qtdQuilowatts;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor do Salário Mínimo");
		salario = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o valor da quantidade de Quilowatts que você utilizou no mês:");
		qtdQuilowatts = Integer.parseInt(in.nextLine());
		
		conta.setSalarioMinimo(salario);
		System.out.println("Salário Mínimo: "+conta.getSalarioMinimo());
		conta.setQuantidadeQuilowatts(qtdQuilowatts);
		System.out.println("Quantidade de Quilowatts Utilizados no Mês: "+conta.getQuantidadeQuilowatts());
		
		System.out.println("Valor do Quilowatts: "+conta.valorCadaQuilowatt());
		System.out.println("Valor Total da Conta de Luz: "+conta.valorTotalResidencia());
		System.out.println("Valor Total da Conta de Luz com 10% de Desconto: "+conta.descontoTotal());
		

	}

}
