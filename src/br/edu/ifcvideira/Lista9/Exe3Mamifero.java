package br.edu.ifcvideira.Lista9;

public class Exe3Mamifero extends Exe3Animal {
	private int patas;
	
	
	public Exe3Mamifero(String animal, int comprimento, String cor, String ambiente, double velocidade, int patas) {
		super();
		super.setAnimal(animal);
		super.setComprimento(comprimento);
		super.setCor(cor);
		super.setAmbiente(ambiente);
		super.setVelocidade(velocidade);
		this.patas = patas;
	}


	public int getPatas() {
		return patas;
	}


	public void setPatas(int patas) {
		this.patas = patas;
	}
}
