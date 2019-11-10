/*
 * 3 – Antes do racionamento de energia ser decretado, quase ninguém falava em
quilowatts; mas, agora, todos incorporam essa palavra em seu vocabulário.
Sabendo-se que 100 quilowatts de energia custam um sétimo do salário mínimo,
fazer uma classe em java que:
 Tenha dois atributos: um que represente o valor do salário mínimo e
outro que represente a quantidade de quilowatts gasta por uma
residência;
 Encapsule esses atributos;
 Crie um método que retorne o valor em reais de cada quilowatt;
 Crie um método que retorne o valor em reais que a residência terá que
pagar;
 Crie um método que retorne o valor em reais que a residência terá que
pagar com desconto de 10%;
 Crie um método main que:
 Atribua um valor aos atributos da classe;
 E que mostre na tela a quantidade em reais que a residência
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
