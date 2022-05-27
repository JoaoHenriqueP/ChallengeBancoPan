// Essa classe contém herança, ela é filha da classe Conta
// Essa classe contém polimorfismo, sendo da interface saque e rendimento
package br.pan.corrente;

import br.pan.conta.Conta;
import br.pan.rendimento.rendimento;
import br.pan.saque.saque;

public class ContaCorrente extends Conta implements saque, rendimento {
	
	private double credito;

	public ContaCorrente(String codConta, double saldo, int numCartao, double credito) {
		super(codConta, saldo, numCartao);
		this.credito = credito;
	}
	
	
}
