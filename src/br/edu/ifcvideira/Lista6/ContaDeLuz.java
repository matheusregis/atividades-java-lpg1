/*
 * 3 � Antes do racionamento de energia ser decretado, quase ningu�m falava em
quilowatts; mas, agora, todos incorporam essa palavra em seu vocabul�rio.
Sabendo-se que 100 quilowatts de energia custam um s�timo do sal�rio m�nimo,
fazer uma classe em java que:
 Tenha dois atributos: um que represente o valor do sal�rio m�nimo e
outro que represente a quantidade de quilowatts gasta por uma
resid�ncia;
 Encapsule esses atributos;
 Crie um m�todo que retorne o valor em reais de cada quilowatt;
 Crie um m�todo que retorne o valor em reais que a resid�ncia ter� que
pagar;
 Crie um m�todo que retorne o valor em reais que a resid�ncia ter� que
pagar com desconto de 10%;
 Crie um m�todo main que:
 Atribua um valor aos atributos da classe;
 E que mostre na tela a quantidade em reais que a resid�ncia
vai pagar, com e sem o desconto.
 */
package br.edu.ifcvideira.Lista6;

public class ContaDeLuz {
	private double salarioMinimo;
	private int quantidadeQuilowatts;
	
	public double getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	public int getQuantidadeQuilowatts() {
		return quantidadeQuilowatts;
	}
	public void setQuantidadeQuilowatts(int quantidadeQuilowatts) {
		this.quantidadeQuilowatts = quantidadeQuilowatts;
	}

	public double valorCadaQuilowatt() {
		double valorQuilowatt;
		
		valorQuilowatt = ( (double) this.getSalarioMinimo()/7/100);
		
		return valorQuilowatt;
	}
	
	public double valorTotalResidencia() {
		double valorTotalGasto;
		
		valorTotalGasto = (this.getQuantidadeQuilowatts() * valorCadaQuilowatt());
		
		return valorTotalGasto;
	}
	
	public double descontoTotal() {
		double desconto;
		
		desconto = valorTotalResidencia() - valorTotalResidencia()*0.10;
		
		return desconto;
	}
}
