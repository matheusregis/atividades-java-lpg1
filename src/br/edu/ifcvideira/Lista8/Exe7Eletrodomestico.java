package br.edu.ifcvideira.Lista8;

public class Exe7Eletrodomestico extends Exe7Produto {
	
	private String voltagem;
	
	public Exe7Eletrodomestico(String codigo, String descricao, double valor, String voltagem) {
		super(codigo, descricao, valor);
		this.voltagem = voltagem;
	}

	@Override
	public void imprimeProduto() {
		System.out.println("Codigo: "+super.getCodigo());
		System.out.println("Descrição: "+super.getDescricao());
		System.out.println("Valor: R$"+super.getValor());
		System.out.println("Voltagem: "+this.voltagem);
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}
	

}
