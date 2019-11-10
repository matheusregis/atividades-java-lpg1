package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int telefone;
		int tipo;
		int local;
		int interUrbano;
		double tarifa;
		double totalLocal;
		double totalinterUrbano;
		double total;
		double taxa;
		
		
		System.out.println("Digite seu número de Telefone/Celular");
		telefone = Integer.parseInt(in.nextLine());
		System.out.println("Digite o Tipo do seu Telefone: 1 - Residencial, 2 - Comercial");
		tipo = Integer.parseInt(in.nextLine());
		if ((tipo != 1) && (tipo != 2)) {
			System.out.println("Tipo de telefone Inválido");
			System.exit(0);
		}
		System.out.println("Digite o número de minutos registrados para chamadas Locais");
		local = Integer.parseInt(in.nextLine());
		System.out.println("Digite o número de minutos registrados para chamadas InterUrbanas");
		interUrbano = Integer.parseInt(in.nextLine());
		totalLocal = local * 0.50;
		totalinterUrbano = interUrbano * 1.10;
		
		System.out.println("----------------------------------------------------------");
		System.out.println("-----------------------SUA CONTA--------------------------");
		if (tipo == 1) {
			tarifa = 10.20;
			total = totalLocal+tarifa+totalinterUrbano;
			taxa = total*0.30;
			System.out.println("-------------TELEFONE: "+telefone+"-------------------");
			System.out.println("-------------TIPO TELEFONE: RESIDENCIAL---------------");
			System.out.println("-------------TARIFA BÁSICA: R$10,20-------------------");
			System.out.println("-------------LIGAÇÕES LOCAIS: "+local+" MINUTOS");
			System.out.println("-------------VALOR POR MINUTOS EM LIGAÇÕES LOCAIS: R$0,50 CENTAVOS");
			System.out.println("-------------TOTAL LIGAÇÕES LOCAIS: R$"+totalLocal);
			System.out.println("-------------LIGAÇÕES INTERURBANAS: "+interUrbano+" MINUTOS");
			System.out.println("--------------VALOR POR MINUTOS EM LIGAÇÕES INTERURBANAS: R$1,10 CENTAVOS");
			System.out.println("-------------TOTAL LIGAÇÕES INTERURBANAS: R$"+totalinterUrbano);
			System.out.println("-------------VALOR TOTAL DA CONTA: "+total+" REAIS");
			System.out.println("-------------TAXA FNT(30%): "+taxa+ " REAIS");
			System.out.println("-------------TOTAL CONTA: "+(total+taxa)+" REAIS");
			System.out.println("----------------------------------------------------------");
		}else if (tipo == 2) {
			tarifa = 19.50;
			total = totalLocal+tarifa+totalinterUrbano;
			taxa = total*0.30;
			System.out.println("-------------TELEFONE: "+telefone+"-------------------");
			System.out.println("-------------TIPO TELEFONE: COMERCIAL-----------------");
			System.out.println("-------------TARIFA BÁSICA: R$19,50-------------------");
			System.out.println("-------------LIGAÇÕES LOCAIS: "+local+" MINUTOS");
			System.out.println("-------------VALOR POR MINUTOS EM LIGAÇÕES LOCAIS: R$0,50 CENTAVOS");
			System.out.println("-------------TOTAL LIGAÇÕES LOCAIS: R$"+totalLocal);
			System.out.println("-------------VALOR TOTAL DA CONTA: "+total+" REAIS");
			System.out.println("-------------LIGAÇÕES INTERURBANAS: "+interUrbano+" MINUTOS");
			System.out.println("-------------VALOR POR MINUTOS EM LIGAÇÕES INTERURBANAS: R$1,10 CENTAVOS");
			System.out.println("-------------TOTAL LIGAÇÕES INTERURBANAS: R$"+totalinterUrbano);
			System.out.println("-------------VALOR TOTAL DA CONTA: "+total+" REAIS");
			System.out.println("-------------TAXA FNT(30%): "+taxa+ " REAIS");
			System.out.println("-------------TOTAL CONTA: "+(total+taxa)+" REAIS");
			System.out.println("----------------------------------------------------------");
		}		
		in.close();
	}
}
