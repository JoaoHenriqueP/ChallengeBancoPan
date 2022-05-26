package br.pan.poupanca;

import br.pan.conta.Conta;
import br.pan.rendimento.rendimento;

public class ContaPoupanca extends Conta implements rendimento {

	public ContaPoupanca(String codConta, double saldo, int numCartao) {
		super(codConta, saldo, numCartao);
	}
	
	

}
