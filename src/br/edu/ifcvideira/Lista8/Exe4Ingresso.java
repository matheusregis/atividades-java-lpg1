/*
 * 4 - Crie uma classe chamada Ingresso que possui um valor em reais.
a. crie uma classe Normal, que herda Ingresso e possui um método que imprime:
"Ingresso Normal" e o seu valor. 
b. Crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um
método que retorne o valor do ingresso VIP e o tipo do ingresso (com o adicional
incluído).
c. crie uma classe CamaroteInferior (que possui a localização do ingresso e
métodos para cadastrar e imprimir esta localização, além de ser mais cara que a
VIP) e uma classe CamaroteSuperior, que é mais cara (possui valor adicional às
demais). Ambas as classes herdam a classe VIP.
Obs: Todas permitem a impressão dos valores e dos tipos dos ingressos.
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
