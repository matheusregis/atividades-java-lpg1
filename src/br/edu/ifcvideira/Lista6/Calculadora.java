/*
 * 4 - Crie uma classe de nome "Calculadora" com os seguintes atributos:
numero1 (private – inteiro)
numero2 (private – inteiro)
Encapsule os atributos;
E os seguintes métodos:
retornaSomaAtributos – este método não deve receber parâmetros, mas deve
retornar a soma dos valores atuais dos seus atributos (numero1 e numero2).
retornaMultiplicacaoAtributos – este método não deve receber parâmetros, mas
deve retornar a multiplicação dos valores atuais dos seus atributos.
insereValoresAtributos – este método deve receber como parâmetros, dois valores
inteiros que devem ser colocados em cada um dos atributos (obs.: este método
não deve retornar valor algum).
Crie uma classe "Principal" (com o método main) que:
 Instancia a classe "Calculadora"
 Coloca valores nos seus atributos.
 Mostra o valor retornado pelo Método "retornaSomaAtributos"
 Mostra o valor retornado pelo Método "retornaMultiplicacaoAtributos"
 Coloca outros valores nos atributos da Classe através do Método
"insereValoresAtributos".
 Mostra o valor dos Atributos.
 */
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
