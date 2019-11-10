/*
 * 2 - Fa�a uma classe Porta com os seguintes atributos: estado (boolean �
aberta/fechada), cor, dimensaoX, dimensaoY e dimensaoZ. Esta classe deve
representar os comportamentos: abrir a porta, fechar a porta, pintar e tamb�m
verificar se a porta est� aberta (atributo estado da porta estaAberta()) . Em
seguida em outra classe (main), crie 1 porta, que possa ser aberta ou fechada e
pintada de diversas cores, alterar suas dimens�es e usar o m�todo estaAberta
para verificar se est� aberta.
 */
package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exe2Porta {
	private boolean estado;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	
	public Exe2Porta() {
		
	}


	public Exe2Porta(String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public double getDimensaoX() {
		return dimensaoX;
	}


	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}


	public double getDimensaoY() {
		return dimensaoY;
	}


	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}


	public double getDimensaoZ() {
		return dimensaoZ;
	}


	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	
	public boolean estaAberta() {
		if (this.estado == true) {
			JOptionPane.showMessageDialog(null, "A Porta est� aberta!");
		}else{
			JOptionPane.showMessageDialog(null, "A Porta est� fechada!");
		}
		
		return this.estado;
	}
	
	public void pintarPorta(String cor) {
		this.setCor(cor);
		System.out.println("A cor da Porta �: "+this.getCor());
	}
	
	
}
