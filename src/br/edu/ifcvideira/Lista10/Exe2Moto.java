package br.edu.ifcvideira.Lista10;


public class Exe2Moto extends Exe2Veiculo {

	@Override
	public void valorDepreciado() {
		if (super.getAno() == 0) {
			super.setDepreciado(super.getValor()-super.getValor()*0.08);
		}else {
			super.setDepreciado(super.getValor()-super.getValor()*(super.getAno()*0.08));
		}
	}

	@Override
	public void calcSeguro() {
		
	}

	@Override
	public void calcIpva() {
		if (super.getAno() < 5) {
			super.setIpva(super.getValor()*0.04);
		}else if ((super.getAno() >= 5) && (super.getAno() < 10))  {
			super.setIpva(super.getValor()*0.03);
		}else if (super.getAno() >= 10) {
			super.setIpva(0);
		}
			
	}
		
}

