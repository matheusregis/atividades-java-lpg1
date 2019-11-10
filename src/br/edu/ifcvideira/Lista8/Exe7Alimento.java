package br.edu.ifcvideira.Lista8;


public class Exe7Alimento extends Exe7Produto {
	
	private String tipo;
	
	public Exe7Alimento(String codigo, String descricao, double valor, String tipo) {
		super(codigo, descricao, valor);
		this.tipo = tipo;
		
	}
	
	@Override
	public void imprimeProduto() {
		System.out.println("Codigo: "+super.getCodigo());
		System.out.println("Descrição: "+super.getDescricao());
		System.out.println("Valor: R$"+super.getValor());
		System.out.println("Tipo: "+this.tipo);
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
