package br.edu.ifcvideira.Lista9;

public class Exe4CarroPasseio extends Exe4Veiculos {
	private String cor;
	private String modelo;
	
	
	public Exe4CarroPasseio() {
		this.cor = null;
		this.modelo = null;
	}

	public Exe4CarroPasseio(int peso, int velocMax, float preco, String cor, String modelo) {
		super(peso,velocMax, preco);
		this.cor = cor;
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public float valorVeiculo(float valor) {
		super.setPreco((float) (valor-valor*0.15));
		return super.getPreco();
	}
}
