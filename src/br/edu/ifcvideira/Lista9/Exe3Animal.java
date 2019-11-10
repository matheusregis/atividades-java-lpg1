package br.edu.ifcvideira.Lista9;

public class Exe3Animal {
	
	private String animal;
	private int comprimento;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Exe3Animal() {
		super();
	}
	public Exe3Animal(String animal, int comprimento, String cor, String ambiente, double velocidade) {
		super();
		this.animal = animal;
		this.comprimento = comprimento;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	
}
