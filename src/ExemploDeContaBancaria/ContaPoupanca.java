package ExemploDeContaBancaria;

public class ContaPoupanca extends Conta{

	protected double saldo;
	
	public void atualiza (double taxa){
		this.saldo += this.saldo * taxa * 3;
	}
}
