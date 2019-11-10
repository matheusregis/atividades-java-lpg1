/*
 * 7 - A companhia telef�nica �Tchau� deseja calcular o valor das contas telef�nicas
mensais de seus assinantes atrav�s do computador. A cobran�a de seus servi�os
� feita obedecendo ao seguinte crit�rio:
Tarifa b�sica: residencial � R$ 10,20;
Comercial � R$ 19,50
Liga��es de servi�o local (para fixo ou celular): R$ 0,50 o minuto
Servi�o de interurbano (para fixo ou celular): R$ 1,10 o minuto
Em cima do valor total da conta, � adicionada uma taxa de 30% para o
Fundo Nacional de Telecomunica��es (FNT).
Ent�o:
Leia um n�mero de telefone e tamb�m as seguintes informa��es:
tipo do telefone: 1 se for residencial, 2 se comercial e qualquer outro
n�mero encerra o algoritmo avisando que o tipo de telefone � inv�lido;
n�mero de minutos registrados para chamadas locais;
 total de minutos registrados para interurbano;
Depois dos dados de entrada o programa dever� calcular o valor da conta e
mostrar o detalhamento para cada tarifa (tipo de linha, local para fixo e
celular, interurbano para fixo e celular, valor da conta, valor da taxa para a
FNT, valor final da conta).

 */
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
		
		
		System.out.println("Digite seu n�mero de Telefone/Celular");
		telefone = Integer.parseInt(in.nextLine());
		System.out.println("Digite o Tipo do seu Telefone: 1 - Residencial, 2 - Comercial");
		tipo = Integer.parseInt(in.nextLine());
		if ((tipo != 1) && (tipo != 2)) {
			System.out.println("Tipo de telefone Inv�lido");
			System.exit(0);
		}
		System.out.println("Digite o n�mero de minutos registrados para chamadas Locais");
		local = Integer.parseInt(in.nextLine());
		System.out.println("Digite o n�mero de minutos registrados para chamadas InterUrbanas");
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
			System.out.println("-------------TARIFA B�SICA: R$10,20-------------------");
			System.out.println("-------------LIGA��ES LOCAIS: "+local+" MINUTOS");
			System.out.println("-------------VALOR POR MINUTOS EM LIGA��ES LOCAIS: R$0,50 CENTAVOS");
			System.out.println("-------------TOTAL LIGA��ES LOCAIS: R$"+totalLocal);
			System.out.println("-------------LIGA��ES INTERURBANAS: "+interUrbano+" MINUTOS");
			System.out.println("--------------VALOR POR MINUTOS EM LIGA��ES INTERURBANAS: R$1,10 CENTAVOS");
			System.out.println("-------------TOTAL LIGA��ES INTERURBANAS: R$"+totalinterUrbano);
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
			System.out.println("-------------TARIFA B�SICA: R$19,50-------------------");
			System.out.println("-------------LIGA��ES LOCAIS: "+local+" MINUTOS");
			System.out.println("-------------VALOR POR MINUTOS EM LIGA��ES LOCAIS: R$0,50 CENTAVOS");
			System.out.println("-------------TOTAL LIGA��ES LOCAIS: R$"+totalLocal);
			System.out.println("-------------VALOR TOTAL DA CONTA: "+total+" REAIS");
			System.out.println("-------------LIGA��ES INTERURBANAS: "+interUrbano+" MINUTOS");
			System.out.println("-------------VALOR POR MINUTOS EM LIGA��ES INTERURBANAS: R$1,10 CENTAVOS");
			System.out.println("-------------TOTAL LIGA��ES INTERURBANAS: R$"+totalinterUrbano);
			System.out.println("-------------VALOR TOTAL DA CONTA: "+total+" REAIS");
			System.out.println("-------------TAXA FNT(30%): "+taxa+ " REAIS");
			System.out.println("-------------TOTAL CONTA: "+(total+taxa)+" REAIS");
			System.out.println("----------------------------------------------------------");
		}		
		in.close();
	}
}
