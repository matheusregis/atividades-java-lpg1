/*
 * 4 - Para um sistema de agenda em que s�o cadastrados contatos pede-se para desenvolver:
Classe pessoa;
Classe colega_de_trabalho (Herda caracter�sticas de pessoa) + setor, etc;
Mensagem de assinatura de e-mail: Att. Fulano de tal.
Classe amigo (Herda caracter�sticas de pessoa) + telefone_pessoal, etc;
Mensagem de assinatura de e-mail: Abra�os. Fulano de tal.
Classe parente (Herda caracter�sticas de pessoa) + parentesco, etc;
Mensagem de assinatura de e-mail: At� mais. Fulano de tal.
 */
package br.edu.ifcvideira.Lista10;

public class Exe4Pessoa {
	private String nome;
	private String rua;
	private String email;
	private String profissao;
	
	public Exe4Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	
	
	
	
}
