package br.edu.ifcvideira.Lista7;

public class Exe3Professor {
	
	private String nome;
	private String departamento;
	private int numeroRegistro;
	private String dataAdmissao;
	
	public Exe3Professor(){
		
	}

	public Exe3Professor(String nome, String departamento, int numeroRegistro, String dataAdmissao) {
		this.nome = nome;
		this.departamento = departamento;
		this.numeroRegistro = numeroRegistro;
		this.dataAdmissao = dataAdmissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}	

}
