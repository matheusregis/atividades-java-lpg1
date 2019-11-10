package br.edu.ifcvideira.Lista10;

public class Exe2Automovel extends Exe2Veiculo {
	
	@Override
	public void valorDepreciado() {
		if (super.getAno()==0) {
			super.setDepreciado(super.getValor()-super.getValor()*0.05);
		}else {
			super.setDepreciado(super.getValor()-super.getValor()*(super.getAno()*0.05));
		}
	}

	@Override
	public void calcSeguro() {
		if (super.getAno() < 5) {
			super.setSeguro(super.getValor()*0.045);
		}else if ((super.getAno() >= 5) && (super.getAno() < 9))  {
			super.setSeguro(super.getValor()*0.05);
		}else if (super.getAno() >= 10) {
			super.setSeguro(super.getValor()*0.055);
		}
		
	}
	
	@Override
	public void calcIpva() {
		if (super.getAno() < 10) {
			super.setIpva(super.getValor()*0.05);
		}else if ((super.getAno() >= 10) && (super.getAno() < 20))  {
			super.setIpva(super.getValor()*0.04);
		}else if (super.getAno() >= 20) {
			super.setIpva(0);
		}
			
	}

}
