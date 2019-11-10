package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exe4Computador {
	private double processador;
	private double memoria;
	private double hd;
	private double monitor;
	private String configuracao;
	
	public Exe4Computador() {
		
	}
	
	public Exe4Computador(double processador, double memoria, double hd, double monitor, String configuracao) {
		this.processador = processador;
		this.memoria = memoria;
		this.hd = hd;
		this.monitor = monitor;
		this.configuracao = configuracao;
	}

	public double getProcessador() {
		return processador;
	}
	public void setProcessador(double processador) {
		this.processador = processador;
	}
	public double getMemoria() {
		return memoria;
	}
	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	public double getHd() {
		return hd;
	}
	public void setHd(double hd) {
		this.hd = hd;
	}
	public double getMonitor() {
		return monitor;
	}
	public void setMonitor(double monitor) {
		this.monitor = monitor;
	}
	public String getConfiguracao() {
		return configuracao;
	}
	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}
	
	public double calculaPreco() {
		return 900 + this.getProcessador() + this.getMemoria() + this.getHd() + this.getMonitor();
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Configuração do computador: \n"
				+ "Gabinete + Placa-mãe + Fonte: R$900\n"
				+ this.getConfiguracao()+"\n"
						+ "Valor Total: R$"+calculaPreco());
	}

}
