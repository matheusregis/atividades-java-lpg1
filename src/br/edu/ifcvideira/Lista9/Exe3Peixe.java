package br.edu.ifcvideira.Lista9;

public class Exe3Peixe extends Exe3Animal {
	
	private String caracteristicas;
	
	public Exe3Peixe(String animal, int comprimento, String cor, String ambiente, double velocidade, String caracteristicas) {
		super();
		super.setAnimal(animal);
		super.setComprimento(comprimento);
		super.setCor(cor);
		super.setAmbiente(ambiente);
		super.setVelocidade(velocidade);
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
}
