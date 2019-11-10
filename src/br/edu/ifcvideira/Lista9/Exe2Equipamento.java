/*
 * 2 - Implemente as seguintes classes:
a) Implemente uma classe Equipamento com o atributo ligado (tipo boolean) e com os
m�todos liga e desliga. O m�todo liga torna o atributo ligado true e o m�todo desliga
torna o atributo ligado false.
b) Implemente uma classe EquipamentoSonoro que herda as caracter�sticas de
Equipamento e que possui os atributos volume (tipo int) que varia de 0 a 10 e stereo (tipo
boolean). A classe ainda deve possuir m�todos para ler e alterar o volume (getter e setter),
al�m dos m�todos mono e stereo. O m�todo mono torna o atributo stereo falso e o m�todo 
stereo torna o atributo stereo verdadeiro. Ao ligar o EquipamentoSonoro atrav�s do
m�todo liga, seu volume � automaticamente ajustado para 5.
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
