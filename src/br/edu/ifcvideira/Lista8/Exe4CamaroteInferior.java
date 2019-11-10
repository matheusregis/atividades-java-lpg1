package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exe4CamaroteInferior extends Exe4Vip {
	
	private String localizacaoIngresso;
	protected double valorCamaroteInferior;
	
	public Exe4CamaroteInferior(double valor) {
		super(valor);
	
	}
	
	@Override
	public double valorAdicional(double valorCamaroteInferior) {
		this.valorCamaroteInferior = valorCamaroteInferior;
		double total;
		total = super.getValor()+super.getValorAdicional()+this.valorCamaroteInferior;
		return total;
	}
	
	@Override
	public void imprimeValor() {
		double total;
		total = super.getValor()+this.valorCamaroteInferior;
		System.out.println("Ingresso Camarote Inferior:\n"
				+ "Valor Normal: R$"+super.getValor()+" + "
						+ "Valor Adicional: R$"+this.valorCamaroteInferior+"\n"
								+ "Valor Total: "+total);
		
	}
	
	public String getLocalizacaoIngresso() {
		return localizacaoIngresso;
	}
	public void setLocalizacaoIngresso(String localizacaoIngresso) {
		this.localizacaoIngresso = localizacaoIngresso;
	}
	public double getValorCamaroteInferior() {
		return valorCamaroteInferior;
	}
	public void setValorCamaroteInferior(double valorCamaroteInferior) {
		this.valorCamaroteInferior = valorCamaroteInferior;
	}
	
	public void cadastraLocalizacao() {
		String localizacao;
		localizacao = String.valueOf(JOptionPane.showInputDialog("Digite a localização do camarote inferior:"));
		this.localizacaoIngresso = localizacao;
		
	}
	public void imprimeLocalizacao() {
		System.out.println("Localização Camarote Inferior: "+this.localizacaoIngresso);
	}
	
	
	

}
