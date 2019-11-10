package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Exe2Main {
	public static void main(String[] args) {
		
	int op;
	Exe2Equipamento som = new Exe2EquipamentoSonoro();
	for(;;) {
		op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:\n"
				+ "1 - Ligar\n"
				+ "2 - Desligar\n"
				+ "3 - Colocar volume\n"
				+ "4 - Mono\n"
				+ "5 - Stereo"));
		if (op == 1) {
			((Exe2EquipamentoSonoro) som).liga();
		} else if (op == 2) {
			som.desliga();
			break;
		} else if (op == 3) {
			((Exe2EquipamentoSonoro) som).setVolume(Integer.parseInt(JOptionPane.showInputDialog("Coloque o volume:")));
		} else if (op == 4) {
			((Exe2EquipamentoSonoro) som).mono();
		} else if (op == 5) {
			((Exe2EquipamentoSonoro) som).stereo();
		}
		JOptionPane.showMessageDialog(null, "Ligado: " +som.isLigado()+"\n"
					+ "Volume: "+((Exe2EquipamentoSonoro) som).getVolume()+"\n"
						+ "Stereo: "+((Exe2EquipamentoSonoro) som).isStereo());
		}
	}
}
