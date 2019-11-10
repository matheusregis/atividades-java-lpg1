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
