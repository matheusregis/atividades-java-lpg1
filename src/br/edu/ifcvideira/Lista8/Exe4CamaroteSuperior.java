package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exe4CamaroteSuperior extends Exe4Vip {
	
	private String localizacaoIngresso;
	private double valorCamaroteSuperior;
	
	public Exe4CamaroteSuperior(double valor) {
		super(valor);
	
	}
	
	@Override
	public double valorAdicional(double valorCamaroteSuperior) {
		this.valorCamaroteSuperior = valorCamaroteSuperior;
		double total;
		total = super.getValor()+super.getValorAdicional()+this.valorCamaroteSuperior;
		
		return total;
	}
	
	@Override
	public void imprimeValor() {
		double total;
		total = super.getValor()+this.valorCamaroteSuperior;
		System.out.println("Ingresso Camarote Superior:\n"
				+ "Valor Normal: R$"+super.getValor()+" + "
						+ "Valor Adicional: R$"+this.valorCamaroteSuperior+"\n"
								+ "Valor Total: "+total);
		
	}
	
	public String getLocalizacaoIngresso() {
		return localizacaoIngresso;
	}
	public void setLocalizacaoIngresso(String localizacaoIngresso) {
		this.localizacaoIngresso = localizacaoIngresso;
	}
	public double getvalorCamaroteSuperior() {
		return valorCamaroteSuperior;
	}
	public void setValorCamaroteSuperiorr(double valorCamaroteSuperior) {
		this.valorCamaroteSuperior = valorCamaroteSuperior;
	}
	
	public void cadastraLocalizacao() {
		String localizacao;
		localizacao = String.valueOf(JOptionPane.showInputDialog("Digite a localização do camarote superior:"));
		this.localizacaoIngresso = localizacao;
		
	}
	public void imprimeLocalizacao() {
		System.out.println("Localização Camarote Superior: "+this.localizacaoIngresso);
	}
	
	
	

}
