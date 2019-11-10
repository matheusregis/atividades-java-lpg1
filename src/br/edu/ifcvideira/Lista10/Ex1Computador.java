package br.edu.ifcvideira.Lista10;

public class Ex1Computador {
	private double placaMae;
	private double processador;
	private double hd;
	private double memoria;
	private int volumes;
	private int garantia;
	private double placaVideo;
	private String config;
	
	public Ex1Computador() {
		
	}
	
	public Ex1Computador(double placaMae, double processador, double hd, double memoria, int volumes, int garantia,
			double placaVideo, String config) {
		this.placaMae = placaMae;
		this.processador = processador;
		this.hd = hd;
		this.memoria = memoria;
		this.volumes = volumes;
		this.garantia = garantia;
		this.placaVideo = placaVideo;
		this.config = config;
	}

	public double getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(double placaMae) {
		this.placaMae = placaMae;
	}

	public double getProcessador() {
		return processador;
	}

	public void setProcessador(double processador) {
		this.processador = processador;
	}

	public double getHd() {
		return hd;
	}

	public void setHd(double hd) {
		this.hd = hd;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public int getVolumes() {
		return volumes;
	}

	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public double getPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(double placaVideo) {
		this.placaVideo = placaVideo;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}
	
	public double calculaPreco() {
		return this.getPlacaMae() + this.getProcessador() + this.getHd() + this.getMemoria()+
				this.getPlacaVideo();
	}
	
	public double calculaPrecoGarantia() {
		return calculaPreco() * 1.1;
	}
	
	public String imprime() {
		return "Dados do computador:\n"
				+this.getConfig()+
				"Total: R$";
	}
	
	
}









