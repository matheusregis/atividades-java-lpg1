package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exe2Principal {
	public static void main(String[] args) {
		String cor;
		double dimensaoX;
		double dimensaoY;
		double dimensaoZ;
		int op;
		int op2;
		
		cor = String.valueOf(JOptionPane.showInputDialog("Digite a cor da porta:"));
		dimensaoX = Double.parseDouble(JOptionPane.showInputDialog("Digite a dimens�o X da porta:"));
		dimensaoY = Double.parseDouble(JOptionPane.showInputDialog("Digite a dimens�o Y da porta:"));
		dimensaoZ = Double.parseDouble(JOptionPane.showInputDialog("Digite a dimens�o Z da porta:"));
		
		Exe2Porta porta = new Exe2Porta(cor,dimensaoX,dimensaoY,dimensaoZ);
		for(;;) {
			
			op2 = Integer.parseInt(JOptionPane.showInputDialog("Dados da Porta:\n"
						+ porta.getCor()+"\n"+"Dimens�o X: "+porta.getDimensaoX()+"\n"+"Dimens�o Y: "+porta.getDimensaoY()+"\n"+"Dimens�o Z: "+porta.getDimensaoZ()+"\n"
								+ "Selecione uma op��o:\n"
								+ "1 - Alterar Cor da Porta\n"
								+ "2 - Alterar Dimens�es da Porta\n"
								+ "3 - Ir para Estado da Porta\n"));
			
				if (op2 == 1) {
					cor = String.valueOf(JOptionPane.showInputDialog("Digite a nova cor da porta:"));
					porta.setCor(cor);
				}else if (op2 == 2){
					dimensaoX = Double.parseDouble(JOptionPane.showInputDialog("Digite a nova dimens�o X da porta:"));
					dimensaoY = Double.parseDouble(JOptionPane.showInputDialog("Digite a nova dimens�o Y da porta:"));
					dimensaoZ = Double.parseDouble(JOptionPane.showInputDialog("Digite a nova dimens�o Z da porta:"));
					porta.setDimensaoX(dimensaoX);
					porta.setDimensaoY(dimensaoY);
					porta.setDimensaoZ(dimensaoZ);
				}else {
					
					op = Integer.parseInt(JOptionPane.showInputDialog("Dados da Porta:\n"
							+porta.getCor()+"\n"+"Dimens�o X: "+porta.getDimensaoX()+"\n"+"Dimens�o Y: "+porta.getDimensaoY()+"\n"+"Dimens�o Z: "+porta.getDimensaoZ()+"\n"
							+"Qual o estado da porta?\n"
							+ "0 - Porta Fechada\n"
							+ "1 - Porta Aberta\n"
							+ "2 - Sair"));
					if (op == 0 ) {
						porta.setEstado(false);
						porta.estaAberta();
					}else if (op == 1){
						porta.setEstado(true);
						porta.estaAberta();
					}else {
						break;
					}
			
				}
			
		}
		
	}
			
}
