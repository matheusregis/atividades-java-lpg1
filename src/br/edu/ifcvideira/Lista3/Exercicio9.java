package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int idade = 0;
		String sexo;
		double salario;
		double mediaSalario = 0;
		int maiorIdade = 0;
		int menorIdade = 999;
		int contFem = 0;
		int contFemSalario = 0;
		int contMasc = 0;
		int contMedia = 0;
		String m = "M";
		String f = "F";
	
		do {
			
			System.out.println("Digite a idade da pessoa ");
			idade = Integer.parseInt(in.nextLine());
			if (idade >= 0 ) {
				if (idade > maiorIdade) {
					maiorIdade = idade;
				}
				if (idade < menorIdade) {					
						menorIdade = idade;					
				}
				System.out.println("Digite o Sexo da pessoa : M - Masculino, F - Feminino");
				sexo = String.valueOf(in.nextLine());
				
				System.out.println("Digite Seu Salário:");
				salario = Double.parseDouble(in.nextLine());
							
				if (sexo.equalsIgnoreCase(m)) {
					if (idade >= 0 ) {
						contMasc++;
					}
				}else if (sexo.equalsIgnoreCase(f)) {
					contFem++;
					if (salario > 2000) {
						contFemSalario++;
					}
				}
				mediaSalario+=salario;
			}
		}while (idade >= 0);
		contMedia = contMasc + contFem;
		System.out.println("Media dos salarios: "+(mediaSalario/contMedia));
		System.out.println("Maior Idade: "+maiorIdade);
		System.out.println("Menor Idade: "+menorIdade);
		System.out.println("Quantidade de mulheres com salário acima de R$2000 é: "+contFemSalario);
		
		in.close();
	}

}
