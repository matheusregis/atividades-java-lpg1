package br.edu.ifcvideira.Lista8;

public abstract class Exe7Produto {
	
	private String codigo;
	private String descricao;
	private double valor;
	
	public Exe7Produto(String codigo, String descricao, double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public void imprimeProduto() {
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Descrição: "+this.descricao);
		System.out.println("Valor: R$"+this.valor);
	}

	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
