/*
 * 1 � Defina uma classe em Java, chamada de Contador, que:
 Declare um atributo chamado numero;
 Encapsule esse atributo;
 Crie um m�todo que incremente o atributo numero, somando 1 ao
valor atual do n�mero;
 Crie um m�todo que desfa�a o incremento, subtraia 1 ao valor atual
do n�mero;
 Crie um m�todo main que:
 Possua um menu para chamada dos m�todos;
 Ao usu�rio digitar 1 chama o m�todo que incrementa;
 Ao usu�rio digitar 2 chama o m�todo que decrementa;
 Cada vez que o valor for alterado apresentar o valor na tela;
 */
package br.edu.ifcvideira.Lista6;

public class Contador {
	
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int incrementaNumero() {
		this.setNumero(this.getNumero()+1);
		return numero;
	}
	public int desfazIncrementoNumero() {
		this.setNumero(this.getNumero()-1);
		return numero;
		
	}
	

}
