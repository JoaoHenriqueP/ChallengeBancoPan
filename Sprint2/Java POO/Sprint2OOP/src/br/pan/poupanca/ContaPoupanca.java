// Essa classe cont�m heran�a, ela � filha da classe Conta
// Essa classe cont�m polimorfismo, da interface rendimento
package br.pan.poupanca;

import br.pan.conta.Conta;
import br.pan.rendimento.rendimento;

public class ContaPoupanca extends Conta implements rendimento {

	public ContaPoupanca(String codConta, double saldo, int numCartao) {
		super(codConta, saldo, numCartao);
	}
	
	

}
