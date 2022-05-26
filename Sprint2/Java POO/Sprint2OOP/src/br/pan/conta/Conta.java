package br.pan.conta;

public abstract class Conta {
	
	protected String codConta;
	protected double saldo;
	protected int numCartao;
	
	public Conta(String codConta, double saldo, int numCartao) {
		this.codConta = codConta;
		this.saldo = saldo;
		this.numCartao = numCartao;
	}
	
	
	

}
