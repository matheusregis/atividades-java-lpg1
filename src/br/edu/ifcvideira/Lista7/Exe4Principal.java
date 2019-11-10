package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exe4Principal {
	public static void main(String[] args) {
		int op;
		
		Exe4Computador co = new Exe4Computador();
		
		op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um processador:\n"
				+ "1 - Processador 3,3Ghz à R$250\n"
				+ "2 - Processador 3,5Ghz à R$310\n"
				+ "3 - Processador 3,9Ghz à R$620\n"));
		
		if (op==1) {
			co.setProcessador(250);	
			co.setConfiguracao("Processador 3,3Ghz: R$"+co.getProcessador()+"\n");
		}else if (op==2) {
			co.setProcessador(310);
			co.setConfiguracao("Processador 3,5Ghz: R$"+co.getProcessador()+"\n");
		}else {
			co.setProcessador(620);
			co.setConfiguracao("Processador 3,9Ghz: R$"+co.getProcessador()+"\n");
		}
		
		
		op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma Memória:\n"
				+ "1 - Memória 2GB à R$300\n"
				+ "2 - Memória 4GB à R$600\n"
				+ "3 - Memória 6GB à R$900\n"
				+ "4 - Memória 8GB à R$1200\n"
				+ "5 - Memória 16GB à R$2400\n"));
		
		
		if (op==1) {
			co.setMemoria(300);	
			co.setConfiguracao(co.getConfiguracao()+"Memória 2GB: R$"+co.getMemoria()+"\n");
		}else if (op==2) {
			co.setMemoria(600);
			co.setConfiguracao(co.getConfiguracao()+"Memória 4GB: R$"+co.getMemoria()+"\n");
		}else if (op==3) {
			co.setMemoria(900);
			co.setConfiguracao(co.getConfiguracao()+"Memória 6GB: R$"+co.getMemoria()+"\n");
		}else if (op==4) {
			co.setMemoria(1200);
			co.setConfiguracao(co.getConfiguracao()+"Memória 8GB: R$"+co.getMemoria()+"\n");
		}else{
			co.setMemoria(2400);
			co.setConfiguracao(co.getConfiguracao()+"Memória 16GB: R$"+co.getMemoria()+"\n");
		}
		
		op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um Disco Rígido:\n"
				+ "1 - Disco Rígido 500GB à R$400\n"
				+ "2 - Disco Rígido 1TB à R$600\n"
				+ "3 - Disco Rígido 2TB à R$800\n"));
		
		if (op==1) {
			co.setHd(400);	
			co.setConfiguracao(co.getConfiguracao()+"Disco Rígido 500GB: R$"+co.getHd()+"\n");
		}else if (op==2) {
			co.setHd(600);	
			co.setConfiguracao(co.getConfiguracao()+"Disco Rígido 1TB: R$"+co.getHd()+"\n");
		}else {
			co.setHd(800);	
			co.setConfiguracao(co.getConfiguracao()+"Disco Rígido 2TB: R$"+co.getHd()+"\n");
		}
		
		op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um Monitor:\n"
				+ "1 - Monitor de 17 Polegadas à R$390\n"
				+ "2 - Monitor de 19 Polegadas à R$520\n"));
		
		if (op==1) {
			co.setMonitor(390);	
			co.setConfiguracao(co.getConfiguracao()+"Monitor de 17 Polegadas: R$"+co.getMonitor()+"\n");
		}else{
			co.setMonitor(520);	
			co.setConfiguracao(co.getConfiguracao()+"Monitor de 19 Polegadas: R$"+co.getMonitor()+"\n");
		}
		
		
		co.imprime();
	}

}
