// Essa classe contém herança, ela é filha da classe Conta.
// Essa classe contém polimorfismo, da interface saque.
package br.pan.salario;

import br.pan.conta.Conta;
import br.pan.saque.saque;

public class ContaSalario extends Conta implements saque {
	
	double salarioMes;

	public ContaSalario(String codConta, double saldo, int numCartao, double salarioMes) {
		super(codConta, saldo, numCartao);
		this.salarioMes = salarioMes;
	}
}
