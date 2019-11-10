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
