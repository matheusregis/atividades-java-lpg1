package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Exe3Main {

	public static void main(String[] args) {
		
		String animal;
		int comprimento;
		String cor;
		String ambiente;
		double velocidade;
		int patas;
		String caracteristicas;
		int op;
		animal = String.valueOf(JOptionPane.showInputDialog("Qual Animal é:"));
		comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o Comprimento do "+animal));
		cor = String.valueOf(JOptionPane.showInputDialog("Digite a cor do :"+animal));
		ambiente = String.valueOf(JOptionPane.showInputDialog("Digite o ambiente que o "+animal+" vive:"));
		velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade do :"+animal));
		patas = Integer.parseInt(JOptionPane.showInputDialog("Quantas patas o "+animal+" possui:"));
		Exe3Mamifero mamifero = new Exe3Mamifero(animal,comprimento,cor,ambiente,velocidade,patas);
		
		animal = String.valueOf(JOptionPane.showInputDialog("Qual Peixe é:"));
		comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o Comprimento do "+animal));
		cor = String.valueOf(JOptionPane.showInputDialog("Digite a cor do :"+animal));
		ambiente = String.valueOf(JOptionPane.showInputDialog("Digite o ambiente que o "+animal+" vive:"));
		velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade do :"+animal));
		caracteristicas = String.valueOf(JOptionPane.showInputDialog("Quais as caracteristicas do "+animal));
		Exe3Peixe peixe = new Exe3Peixe(animal,comprimento,cor,ambiente,velocidade,caracteristicas);
		
		for(;;) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das Opções:"
					+ "1 - Imprimir Mamifero\n"
					+ "2 - Imprimir Peixe\n"
					+ "3 - Imprimir os dois\n"
					+ "4 - Sair"));
			
			if (op == 1) {
				JOptionPane.showMessageDialog(null, "Você escolheu Imprimir Mamifero:\n"
						+ "Animal: "+mamifero.getAnimal()+"\n"
								+ "Comprimento: "+mamifero.getComprimento()+"\n"
										+ "Cor: "+mamifero.getCor()+"\n"
												+ "Ambiente: "+mamifero.getAmbiente()+"\n"
														+ "Velocidade: "+mamifero.getVelocidade()+"\n"
																+ "Patas: "+mamifero.getPatas());
			}else if (op == 2) {
				JOptionPane.showMessageDialog(null, "Você escolheu Imprimir Peixes:"
						+ "Animal: "+peixe.getAnimal()+"\n"
								+ "Comprimento: "+peixe.getComprimento()+"\n"
										+ "Cor: "+peixe.getCor()+"\n"
												+ "Ambiente: "+peixe.getAmbiente()+"\n"
														+ "Velocidade: "+peixe.getVelocidade()+"\n"
																+ "Caracteristicas: "+peixe.getCaracteristicas());
			}else if (op == 3) {
				JOptionPane.showMessageDialog(null, "Você escolheu Imprimir os dois:\n"
						+ "Animal: "+mamifero.getAnimal()+"\n"
								+ "Comprimento: "+mamifero.getComprimento()+" metros.\n"
										+ "Cor: "+mamifero.getCor()+"\n"
												+ "Ambiente: "+mamifero.getAmbiente()+"\n"
														+ "Velocidade: "+mamifero.getVelocidade()+" KM/h\n"
																+ "Patas: "+mamifero.getPatas()+"\n"
																		+"\n"
																				+ "Animal: "+peixe.getAnimal()+"\n"
																						+ "Comprimento: "+peixe.getComprimento()+" metros.\n"
																								+ "Cor: "+peixe.getCor()+"\n"
																										+ "Ambiente: "+peixe.getAmbiente()+"\n"
																												+ "Velocidade: "+peixe.getVelocidade()+" KM/h\n"
																														+ "Caracteristicas: "+peixe.getCaracteristicas());
																		
			}else {
				break;
			}
		}

	}
}
