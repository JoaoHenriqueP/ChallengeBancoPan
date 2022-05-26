package br.pan.usuario;

public class Usuario {
	
	private String cpf;
	private String codConta;
	private String senha;
	private String telefone;
	private String email;
	private String dataNasc;
	private String nomeMae;
	
	public Usuario(String cpf, String codConta, String senha, String telefone, String email, String dataNasc, String nomeMae) {
		this.cpf = cpf;
		this.codConta = codConta;
		this.senha = senha;
		this.telefone = telefone;
		this.email = email;
		this.dataNasc = dataNasc;
		this.nomeMae = nomeMae;
	}
	
	

}
