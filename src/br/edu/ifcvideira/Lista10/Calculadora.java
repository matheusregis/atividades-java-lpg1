package br.edu.ifcvideira.Lista10;

public class Calculadora {
	
	private double numero1;
	private double numero2;
	
	public double getNumero1() {
		return numero1;
	}
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public double soma() {
		return this.getNumero1() + this.getNumero2();
	}
	public double subtrair() {
		return this.getNumero1() - this.getNumero2();
	}
	public double multiplicacao() {
		return this.getNumero1() * this.getNumero2();
	}
	public double divisao() {
		return this.getNumero1() / this.getNumero2();
	}
}
