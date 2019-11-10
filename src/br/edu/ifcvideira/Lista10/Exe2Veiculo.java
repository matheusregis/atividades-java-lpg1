package br.edu.ifcvideira.Lista10;

public abstract class Exe2Veiculo {
	private double valor;
	private double depreciado;
	private int ano;
	private double seguro;
	private double ipva;
	
	public Exe2Veiculo(){
		
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getSeguro() {
		return seguro;
	}

	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}

	public double getIpva() {
		return ipva;
	}

	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	public double getDepreciado() {
		return depreciado;
	}

	public void setDepreciado(double depreciado) {
		this.depreciado = depreciado;
	}
	
	public abstract void valorDepreciado();
	public abstract void calcSeguro();
	public abstract void calcIpva();

	
}
