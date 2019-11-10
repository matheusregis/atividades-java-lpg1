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
		
		peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o Peso do Ve�culo"));
		velocMax = Integer.parseInt(JOptionPane.showInputDialog("Digite a Velocidade M�xima do Ve�culo"));
		preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o pre�o do Ve�culo"));
		cor = String.valueOf(JOptionPane.showInputDialog("Digite a cor do Ve�culo:"));
		modelo = String.valueOf(JOptionPane.showInputDialog("Digite o modelo do Ve�culo:"));
		Exe4CarroPasseio carro = new Exe4CarroPasseio(peso, velocMax, preco, cor, modelo);
		
		peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o Peso do Caminh�o"));
		velocMax = Integer.parseInt(JOptionPane.showInputDialog("Digite a Velocidade M�xima do Caminh�o"));
		preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o pre�o do Caminh�o"));
		toneladas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas toneladas est�o carregadas no Caminh�o"));
		alturaMax = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura m�xima da carga do Caminh�o"));
		comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do Caminh�o"));
		Exe4Caminhao caminhao = new Exe4Caminhao(peso, velocMax, preco, toneladas, alturaMax, comprimento);
		
		for(;;) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das Op��es:"
					+ "1 - Imprimir Carro de Passeio\n"
					+ "2 - Imprimir Caminh�o\n"
					+ "3 - Imprimir os dois\n"
					+ "4 - Sair"));
			
			if (op == 1) {
				JOptionPane.showMessageDialog(null, "Voc� escolheu Imprimir o carro de passeio:\n"
						+ "Peso: "+carro.getPeso()+"\n"
								+ "Velocidade M�xima: "+carro.getVelocMax()+"\n"
										+ "Pre�o: "+carro.getPreco()+"\n"
												+ "Cor: "+carro.getCor()+"\n"
														+ "Modelo: "+carro.getModelo());
			}else if (op == 2) {
				JOptionPane.showMessageDialog(null, "Voc� escolheu Imprimir o Caminh�o:"
						+ "Peso: "+caminhao.getPeso()+"\n"
								+ "Velocidade M�xima: "+caminhao.getVelocMax()+"\n"
										+ "Pre�o: "+caminhao.getPreco()+"\n"
												+ "Toneladas: "+caminhao.getToneladas()+"\n"
														+ "Altura M�xima: "+caminhao.getAlturaMaxima()+"\n"
																+ "Comprimento: "+caminhao.getComprimento());
			}else if (op == 3) {
				JOptionPane.showMessageDialog(null, "Voc� escolheu Imprimir o carro de passeio e o Caminh�o:\n"
						+ "Peso do Carro: "+carro.getPeso()+" kg.\n"
								+ "Velocidade M�xima do Carro: "+carro.getVelocMax()+" KM/h.\n"
										+ "Pre�o do Carro: R$"+carro.getPreco()+" reais.\n"
												+ "Cor do Carro: "+carro.getCor()+"\n"
														+ "Modelo do Carro: "+carro.getModelo()+"\n"
																+"\n"
																		+  "Peso do Caminh�o: "+caminhao.getPeso()+" kg.\n"
																				+ "Velocidade M�xima do Caminh�o: "+caminhao.getVelocMax()+" KM/h.\n"
																						+ "Pre�o do Caminh�o: R$"+caminhao.getPreco()+" reais.\n"
																								+ "Toneladas da Carga: "+caminhao.getToneladas()+" toneladas.\n"
																										+ "Altura M�xima da Carga: "+caminhao.getAlturaMaxima()+" metros.\n"
																												+ "Comprimento: "+caminhao.getComprimento()+" metros.");
			}else {
				break;
			}
		}
		

	}

}
