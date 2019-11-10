/*
 * 10 - Fa�a um programa em JAVA para ler inicialmente o nome, o pre�o, a
quantidade e o c�digo de 10 produtos e armazenar estes itens em vetores. Cada
produto tem um c�digo entre 0 e 9 e os c�digos s�o �nicos. Depois que os dados
dos produtos forem armazenados, perguntar o c�digo de um produto, perguntar se
foi venda ou compra e a quantidade (vendida / comprada) e alterar os vetores
correspondentes. Continuar perguntando at� que o usu�rio informe um c�digo 
composto por um n�mero negativo. Ap�s terminada a movimenta��o, mostrar a
lista de produtos com o c�digo, descri��o, pre�o unit�rio e quantidade em estoque
e o valor total do estoque de cada item. Imprimir tamb�m o valor total do estoque
para todos os itens juntos.

 */
package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nomeProduto[] = new String[3];
		int codigoProduto[] = new int[3];
		double precoProduto[] = new double[3];
		int quantidadeProduto[] = new int[3];
		int verificaCodigo[] = new int[3];
		int aux;
		int i;
		int pos = 3;

		for (i = 0; i < pos; i++) {
			System.out.println("Digite o nome do Produto "+(i+1));
			nomeProduto[i] = String.valueOf(in.nextLine());
			System.out.println("Digite a quantidade que ser� cadastrada do produto " + nomeProduto[i]);
			quantidadeProduto[i] = Integer.parseInt(in.nextLine());
			System.out.println("Digite o Valor Unit�rio do Produto " + nomeProduto[i]);
			precoProduto[i] = Double.parseDouble(in.nextLine());
			System.out.println("Digite o C�digo do Produto "+(i+1)+"(Somente C�digos entre 0 e 9)");
			codigoProduto[i] = Integer.parseInt(in.nextLine());
			if (codigoProduto[i] < 0 || codigoProduto[i] > 9) {
				System.out.println("Valor do c�digo Inv�lido!");
				System.exit(0);
			}
			
		}
			
	}

}

