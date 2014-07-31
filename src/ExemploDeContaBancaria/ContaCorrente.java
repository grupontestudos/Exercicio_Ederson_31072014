package ExemploDeContaBancaria;

public class ContaCorrente extends Conta{
	
	protected double saldo;
	
	public void atualiza (double taxa){
		this.saldo += this.saldo * taxa * 2;
	}
	
	public void deposito (double valor){
		this.saldo += valor - 0.10;
	}

}
