package br.edu.ifcvideira.Lista9;

public class Exe4Caminhao extends Exe4Veiculos {
	
	private int toneladas;
	private int alturaMaxima;
	private int comprimento;
	
	public Exe4Caminhao() {
		this.toneladas = 0;
		this.alturaMaxima = 0;
		this.comprimento = 0;
	}

	public Exe4Caminhao(int peso, int velocMax, float preco, int toneladas, int alturaMaxima, int comprimento) {
		super(peso,velocMax, preco);
		this.toneladas = toneladas;
		this.alturaMaxima = alturaMaxima;
		this.comprimento = comprimento;
	}
	
	public int getToneladas() {
		return toneladas;
	}
	public void setToneladas(int toneladas) {
		this.toneladas = toneladas;
	}
	public int getAlturaMaxima() {
		return alturaMaxima;
	}
	public void setAlturaMaxima(int alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	@Override
	public float valorVeiculo(float valor) {
		super.setPreco((float) (valor-valor*0.20));
		return super.getPreco();
	}

}
