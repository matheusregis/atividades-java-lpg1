/*
 * 2 - Elabore uma aplica��o para uma concession�ria de ve�culos, Para isto:
Implemente uma classe ve�culo:
Implemente uma classe moto, que herda caracter�sticas de ve�culo;
Implemente uma classe autom�vel, que herda caracter�sticas de ve�culo;
Implemente uma classe caminh�o, que herda caracter�sticas de ve�culo;
Implemente m�todos para c�lculo do valor de tabela do ve�culo, levando em conta os
seguintes par�metros:
Entrada: valor do ve�culo novo.
Para cada ano de uso em se tratando de moto � depreciado 8%, autom�vel � depreciado 5%
e caminh�o 3,5%;
Para c�lculo do seguro do ve�culo s�o determinadas as seguintes op��es: moto: (N�o �
poss�vel contratar seguro pela concession�ria), autom�vel: o valor do seguro � de 4,5% para
ve�culos com at� 5 anos de uso, 5% para ve�culos entre 5 e 10 anos de uso e 5,5% para mais
de 10 anos de uso. Caminh�es valor de 500,00 para cada 10 toneladas de capacidade.
C�lculo de IPVA:
moto - 4% para at� 5 anos de uso, 3% para at� 10 anos de uso, + de 10 anos � isento:
autom�vel - 5% para at� 10 anos de uso, 4% para at� 20 anos de uso, + de 20 anos � isento:
caminh�o - 4% para at� 50 toneladas de capacidade, 3% para capacidade maior de 50
toneladas, se tiver + de 15 anos de uso � isento. (Independente da capacidade):
A sa�da deve apresentar o valor atual do ve�culo, o valor do seguro e o valor do IPVA.

 */
package br.edu.ifcvideira.Lista10;

public abstract class Exe2Veiculo {
	private double valor;
	private double depreciado;
	private int ano;
	private double seguro;
	private double ipva;
	
	public Exe2Veiculo(){
		
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getSeguro() {
		return seguro;
	}

	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}

	public double getIpva() {
		return ipva;
	}

	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	public double getDepreciado() {
		return depreciado;
	}

	public void setDepreciado(double depreciado) {
		this.depreciado = depreciado;
	}
	
	public abstract void valorDepreciado();
	public abstract void calcSeguro();
	public abstract void calcIpva();

	
}
