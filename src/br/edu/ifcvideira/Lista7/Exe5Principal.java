package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exe5Principal {
	public static void main(String[] args) {
				
		Exe5Livro livro1 = new Exe5Livro();
		livro1.setTitulo("Fundamentos da programação de computadores");
		livro1.setAutor("Ascencio");
		livro1.setAno(2012);
		
		Exe5Livro livro2 = new Exe5Livro();
		livro2.setTitulo("Programação com C");
		livro2.setAutor("Professor X");
		livro2.setAno(2010);
		
		Exe5Livro livro3 = new Exe5Livro();
		livro3.setTitulo("Programação com Java");
		livro3.setAutor("Professor Y");
		livro3.setAno(2013);
		
		JOptionPane.showMessageDialog(null, "PRIMEIRO LIVRO\n"
				+ "(Título = "+livro1.getTitulo()+"; Autor = "+livro1.getAutor()+"; Ano = "+livro1.getAno()+")\n"
						+ "SEGUNDO LIVRO\n"
						+ "(Título = "+livro2.getTitulo()+"; Autor = "+livro2.getAutor()+"; Ano = "+livro2.getAno()+")\n"
								+ "TERCEIRO LIVRO\n"
								+ "(Título = "+livro3.getTitulo()+"; Autor = "+livro3.getAutor()+"; Ano = "+livro3.getAno()+")");
	}

}
