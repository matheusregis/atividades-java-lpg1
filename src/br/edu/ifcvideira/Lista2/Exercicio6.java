package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double massa;
		double densidade;
		double preco;
		double volume;
		System.out.println("Digite a massa do Leite");
		massa = Double.parseDouble(in.nextLine());
		System.out.println("Digite a densidade do Leite");
		densidade = Double.parseDouble(in.nextLine());
		System.out.println("Digite o valor diário do Leite");
		preco = Double.parseDouble(in.nextLine());
		volume = massa/densidade;
		System.out.println("Massa do Leite: "+massa);
		System.out.println("Densidade do Leite: "+densidade);
		System.out.println("Valor Diário do Leite:"+preco);
		System.out.println("Volume do Leite: "+volume);
		System.out.println("Valor Total pago ao cooperado: "+(preco*massa));
		if (densidade < 1.14) {
			System.out.println("Densidade: Categoria I");
		}else if ((densidade >= 1.14)&&(densidade <1.20)) {
			System.out.println("Densidade: Categoria II");
		}else {
			System.out.println("Densidade: Categoria III");
		}
		
		
		in.close();
	}
}
