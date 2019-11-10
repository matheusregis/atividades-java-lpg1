/*
 * 2 - Implemente as seguintes classes:
a) Implemente uma classe Equipamento com o atributo ligado (tipo boolean) e com os
métodos liga e desliga. O método liga torna o atributo ligado true e o método desliga
torna o atributo ligado false.
b) Implemente uma classe EquipamentoSonoro que herda as características de
Equipamento e que possui os atributos volume (tipo int) que varia de 0 a 10 e stereo (tipo
boolean). A classe ainda deve possuir métodos para ler e alterar o volume (getter e setter),
além dos métodos mono e stereo. O método mono torna o atributo stereo falso e o método 
stereo torna o atributo stereo verdadeiro. Ao ligar o EquipamentoSonoro através do
método liga, seu volume é automaticamente ajustado para 5.
 */
package br.edu.ifcvideira.Lista9;

public class Exe2Equipamento {

	private boolean ligado;
	
	public void liga() {
		this.ligado = true;
	}
	public void desliga() {
		this.ligado = false;
	}
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}	
}
