package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exe5Principal {
	public static void main(String[] args) {
				
		Exe5Livro livro1 = new Exe5Livro();
		livro1.setTitulo("Fundamentos da programa��o de computadores");
		livro1.setAutor("Ascencio");
		livro1.setAno(2012);
		
		Exe5Livro livro2 = new Exe5Livro();
		livro2.setTitulo("Programa��o com C");
		livro2.setAutor("Professor X");
		livro2.setAno(2010);
		
		Exe5Livro livro3 = new Exe5Livro();
		livro3.setTitulo("Programa��o com Java");
		livro3.setAutor("Professor Y");
		livro3.setAno(2013);
		
		JOptionPane.showMessageDialog(null, "PRIMEIRO LIVRO\n"
				+ "(T�tulo = "+livro1.getTitulo()+"; Autor = "+livro1.getAutor()+"; Ano = "+livro1.getAno()+")\n"
						+ "SEGUNDO LIVRO\n"
						+ "(T�tulo = "+livro2.getTitulo()+"; Autor = "+livro2.getAutor()+"; Ano = "+livro2.getAno()+")\n"
								+ "TERCEIRO LIVRO\n"
								+ "(T�tulo = "+livro3.getTitulo()+"; Autor = "+livro3.getAutor()+"; Ano = "+livro3.getAno()+")");
	}

}
