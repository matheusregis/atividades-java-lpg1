package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Exe1Main {

	public static void main(String[] args) {
		
		Exe1Pessoa pessoa1 = new Exe1Pessoa("Mario","Lopes");
		Exe1Funcionario pessoa2 = new Exe1Funcionario("Lucas","Mendes",111, 2000.0);
		Exe1Professor pessoa3 = new Exe1Professor("Rafael","Lira",112,500.0);
		
		JOptionPane.showMessageDialog(null, "Nomes: \n"
				+ pessoa1.getNomeCompleto() + "\n"
					+ pessoa2.getNomeCompleto() + "\n"
						+ pessoa3.getNomeCompleto());
		JOptionPane.showMessageDialog(null, "Salario de " + pessoa2.getNomeCompleto() + ": \n1ª parcela: "
				+ pessoa2.getSalarioPrimeiraParcela() + "\n" + "2ª parcela: " + pessoa2.getSalarioSegundaParcela());
		JOptionPane.showMessageDialog(null, "Salario de " + pessoa3.getNomeCompleto() + ": \n1ª parcela: "
				+ pessoa3.getSalarioPrimeiraParcela() + "\n" + "2ª parcela: " + pessoa3.getSalarioSegundaParcela());
	}
}
