package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Exe4Main {

	public static void main(String[] args) {
		
		int peso;
		int velocMax;
		float preco;
		String cor;
		String modelo;
		int toneladas;
		int alturaMax;
		int comprimento;
		int op;
		
		peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o Peso do Veículo"));
		velocMax = Integer.parseInt(JOptionPane.showInputDialog("Digite a Velocidade Máxima do Veículo"));
		preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do Veículo"));
		cor = String.valueOf(JOptionPane.showInputDialog("Digite a cor do Veículo:"));
		modelo = String.valueOf(JOptionPane.showInputDialog("Digite o modelo do Veículo:"));
		Exe4CarroPasseio carro = new Exe4CarroPasseio(peso, velocMax, preco, cor, modelo);
		
		peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o Peso do Caminhão"));
		velocMax = Integer.parseInt(JOptionPane.showInputDialog("Digite a Velocidade Máxima do Caminhão"));
		preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do Caminhão"));
		toneladas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas toneladas estão carregadas no Caminhão"));
		alturaMax = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura máxima da carga do Caminhão"));
		comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do Caminhão"));
		Exe4Caminhao caminhao = new Exe4Caminhao(peso, velocMax, preco, toneladas, alturaMax, comprimento);
		
		for(;;) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das Opções:"
					+ "1 - Imprimir Carro de Passeio\n"
					+ "2 - Imprimir Caminhão\n"
					+ "3 - Imprimir os dois\n"
					+ "4 - Sair"));
			
			if (op == 1) {
				JOptionPane.showMessageDialog(null, "Você escolheu Imprimir o carro de passeio:\n"
						+ "Peso: "+carro.getPeso()+"\n"
								+ "Velocidade Máxima: "+carro.getVelocMax()+"\n"
										+ "Preço: "+carro.getPreco()+"\n"
												+ "Cor: "+carro.getCor()+"\n"
														+ "Modelo: "+carro.getModelo());
			}else if (op == 2) {
				JOptionPane.showMessageDialog(null, "Você escolheu Imprimir o Caminhão:"
						+ "Peso: "+caminhao.getPeso()+"\n"
								+ "Velocidade Máxima: "+caminhao.getVelocMax()+"\n"
										+ "Preço: "+caminhao.getPreco()+"\n"
												+ "Toneladas: "+caminhao.getToneladas()+"\n"
														+ "Altura Máxima: "+caminhao.getAlturaMaxima()+"\n"
																+ "Comprimento: "+caminhao.getComprimento());
			}else if (op == 3) {
				JOptionPane.showMessageDialog(null, "Você escolheu Imprimir o carro de passeio e o Caminhão:\n"
						+ "Peso do Carro: "+carro.getPeso()+" kg.\n"
								+ "Velocidade Máxima do Carro: "+carro.getVelocMax()+" KM/h.\n"
										+ "Preço do Carro: R$"+carro.getPreco()+" reais.\n"
												+ "Cor do Carro: "+carro.getCor()+"\n"
														+ "Modelo do Carro: "+carro.getModelo()+"\n"
																+"\n"
																		+  "Peso do Caminhão: "+caminhao.getPeso()+" kg.\n"
																				+ "Velocidade Máxima do Caminhão: "+caminhao.getVelocMax()+" KM/h.\n"
																						+ "Preço do Caminhão: R$"+caminhao.getPreco()+" reais.\n"
																								+ "Toneladas da Carga: "+caminhao.getToneladas()+" toneladas.\n"
																										+ "Altura Máxima da Carga: "+caminhao.getAlturaMaxima()+" metros.\n"
																												+ "Comprimento: "+caminhao.getComprimento()+" metros.");
			}else {
				break;
			}
		}
		

	}

}
