/*
 * 3 – Faça uma calculadora que mostre quantos azulejos são necessários para azulejar uma
parede. 
É necessário conhecer a altura da parede (AP), a sua largura (LP), e a altura do azulejo (A)
e sua largura (LA). Leia os dados através do teclado.
O azulejo pode ser quadrado: L*L = Área
O azulejo pode ser retangular: H*L= Área
O azulejo pode ser triangular de lados iguais: L*L/2 = Área
O azulejo pode ser triangular de lados diferentes: H*L/2 = Área
 */
package br.edu.ifcvideira.Lista10;

public class Exe3CalculadoraAzuleijos {
	private double alturaParede;
	private double larguraParede;
	private double larguraAzuleijo;
	private double alturaAzuleijo;
	
	public Exe3CalculadoraAzuleijos() {
		
	}

	public double getAlturaParede() {
		return alturaParede;
	}

	public void setAlturaParede(double alturaParede) {
		this.alturaParede = alturaParede;
	}

	public double getLarguraParede() {
		return larguraParede;
	}

	public void setLarguraParede(double larguraParede) {
		this.larguraParede = larguraParede;
	}

	public double getLarguraAzuleijo() {
		return larguraAzuleijo;
	}

	public void setLarguraAzuleijo(double larguraAzuleijo) {
		this.larguraAzuleijo = larguraAzuleijo;
	}

	public double getAlturaAzuleijo() {
		return alturaAzuleijo;
	}

	public void setAlturaAzuleijo(double alturaAzuleijo) {
		this.alturaAzuleijo = alturaAzuleijo;
	}
	
	public void areaAzuleijoQuadrado() {
		double area;
		area = this.larguraAzuleijo*this.larguraAzuleijo;
	}
	public void areaAzuleijoRetangulo() {
		double area;
		area = this.alturaAzuleijo*this.larguraAzuleijo;
	}
	public void areaAzuleijoTriangularLadoIgual() {
		double area;
		area = (this.larguraAzuleijo*this.larguraAzuleijo)/2;
	}
	public void areaAzuleijoTriangularLadoDiferente() {
		double area;
		area = (this.alturaAzuleijo*this.larguraAzuleijo)/2;
	}
	public void areaParede() {
		double areaParede;
		areaParede = this.alturaParede*this.larguraParede;
	}
}
