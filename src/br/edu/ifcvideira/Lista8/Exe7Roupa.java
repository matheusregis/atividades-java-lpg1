package br.edu.ifcvideira.Lista8;

public class Exe7Roupa extends Exe7Produto {
	private String tamanho;
	private String cor;
	
	public Exe7Roupa(String codigo, String descricao, double valor, String tamanho, String cor) {
		super(codigo, descricao, valor);
		this.tamanho = tamanho;
		this.cor = cor;
		
	}
	
	@Override
	public void imprimeProduto() {
		System.out.println("Codigo: "+super.getCodigo());
		System.out.println("Descrição: "+super.getDescricao());
		System.out.println("Valor: R$"+super.getValor());
		System.out.println("Tamanho: "+this.tamanho);
		System.out.println("Cor: "+this.cor);
	}
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
