package br.edu.ifcvideira.Lista10;

public class Exe2Caminhao extends Exe2Veiculo {
	private int capacidade;

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	@Override
	public void valorDepreciado() {
		if (super.getAno()==0) {
			super.setDepreciado(super.getValor()-super.getValor()*0.035);
		}else {
			super.setDepreciado(super.getValor()-super.getValor()*(super.getAno()*0.035));
		}
	}

	@Override
	public void calcSeguro() {
		int valor=0;
		if (capacidade/10 <= 0) {
			valor = 0;
		}else {
			valor = capacidade/10;
		}
		super.setSeguro(valor*500);
	}
	
	@Override
	public void calcIpva() {
		if (this.capacidade < 50) {
			super.setIpva(super.getValor()*0.04);
		}else if ((this.capacidade >= 50))  {
			super.setIpva(super.getValor()*0.03);
		}else if (super.getAno() >= 15) {
			super.setIpva(0);
		}
			
	}

}
