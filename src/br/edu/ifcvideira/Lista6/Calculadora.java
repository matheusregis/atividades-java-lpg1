package br.edu.ifcvideira.Lista6;

public class Calculadora {
	private int numero1;
	private int numero2;
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public int retornaSomaAtributos() {
		return numero1 + numero2;
	}
	public int retornaMultiplicaAtributos() {
		return numero1 * numero2;
	}
	
	public void insereValor(int valor1, int valor2) {
		setNumero1(valor1);
		setNumero2(valor2);
		System.out.println(valor1);
		System.out.println(valor2);
	}
}
