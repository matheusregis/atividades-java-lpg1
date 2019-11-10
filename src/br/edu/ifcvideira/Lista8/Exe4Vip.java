package br.edu.ifcvideira.Lista8;

public class Exe4Vip extends Exe4Ingresso {
	

	private double valorVip;
	
	public Exe4Vip(double valor) {
		super(valor);
		
	}
	
	public double valorAdicional(double valorVip) {

		this.valorVip = valorVip;
		double total;
		total = super.getValor()+this.valorVip;
		return total;
	}

	public double getValorAdicional() {
		return valorVip;
	}

	public void setValorAdicional(double valorVip) {
		this.valorVip = valorVip;
	}

	@Override
	public void imprimeValor() {
		double total;
		total = super.getValor()+this.valorVip;
		System.out.println("Ingresso Vip:\n"
				+ "Valor Normal: R$"+super.getValor()+" + "
						+ "Valor Adicional: R$"+this.valorVip+"\n"
								+ "Valor Total: "+total);
		
	}
	

}
