/*
 * 4 - Crie uma classe chamada Ingresso que possui um valor em reais.
a. crie uma classe Normal, que herda Ingresso e possui um m�todo que imprime:
"Ingresso Normal" e o seu valor. 
b. Crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um
m�todo que retorne o valor do ingresso VIP e o tipo do ingresso (com o adicional
inclu�do).
c. crie uma classe CamaroteInferior (que possui a localiza��o do ingresso e
m�todos para cadastrar e imprimir esta localiza��o, al�m de ser mais cara que a
VIP) e uma classe CamaroteSuperior, que � mais cara (possui valor adicional �s
demais). Ambas as classes herdam a classe VIP.
Obs: Todas permitem a impress�o dos valores e dos tipos dos ingressos.
 */
package br.edu.ifcvideira.Lista8;

public abstract class Exe4Ingresso {
	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Exe4Ingresso(double valor) {
		super();
		this.valor = valor;
	}

	public abstract void imprimeValor();
}
