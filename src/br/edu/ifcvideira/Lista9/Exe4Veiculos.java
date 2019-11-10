/*
 * 4 - Escreva a classe Veiculo contendo Peso em quilos (int), VelocMax em Km/h (int) e
Preco em R$ (float). Inclua um construtor sem argumentos que inicialize os dados com os
valores recebidos como argumento. Crie os getters e setters da classe; Crie um método para
calcular o valor do veículo com 10% de desconto;
b) Crie uma classe CarroPasseio que herda Veiculo como base. Inclua Cor (string) e
Modelo (string). Inclua um construtor sem argumentos que inicialize os dados com zeros e
uma que inicialize os dados com os valores recebidos como argumentos. Crie os getters e
setters da classe; Crie um método para calcular o valor do Carro que sobrescreva o método
da classe veículo aplicando 15% de desconto;
c) Crie uma classe Caminhao que herda Veiculo. Inclua Toneladas (carga máxima),
AlturaMax (int) e Comprimento (int). Inclua um construtor sem argumentos que inicialize
os dados com zeros e um que inicialize com os valores recebidos como argumento. Crie os
getters e setters da classe; Crie um método para calcular o valor do Caminhão que
sobrescreva o método da classe veículo aplicando 20% de desconto;
 */
package br.edu.ifcvideira.Lista9;

public abstract class Exe4Veiculos {
	
	private int peso;
	private int velocMax;
	private float preco;
	
	public Exe4Veiculos() {
		super();
		this.peso = 0;
		this.velocMax = 0;
		this.preco = 0;
	}

	public Exe4Veiculos(int peso, int velocMax, float preco) {
		super();
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(int velocMax) {
		velocMax = velocMax;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float valorVeiculo(float valor) {
		this.preco =(float) (valor-valor*0.10);
		return this.preco;
	}
	
	

}
