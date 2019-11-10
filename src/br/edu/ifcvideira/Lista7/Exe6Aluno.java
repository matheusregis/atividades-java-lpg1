/*
 * 6 - Crie uma classe chamada de Aluno, esta classe tem os seguintes atributos:
matricula, nome, e-mail, curso, fone, cel e endereço. Esta classe deve conter os
getters e setters, além do construtor padrão (vazio), mais um construtor que
receba todos os atributos como parâmetros. Crie uma classe main, na qual o
usuário possa cadastrar um aluno pelas duas maneiras.
 */
package br.edu.ifcvideira.Lista7;

public class Exe6Aluno {
	
	private String matricula;
	private String nome;
	private String email;
	private String curso;
	private String telefone;
	private String celular;
	private String endereco;
	
	public Exe6Aluno() {
		
	}

	public Exe6Aluno(String matricula, String nome, String email, String curso, String telefone, String celular,
			String endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.curso = curso;
		this.telefone = telefone;
		this.celular = celular;
		this.endereco = endereco;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
