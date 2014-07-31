package ExemploDeContaBancaria;
/**
 * 
 * @author deson
 * sice 28/07/2014
 *
 */

public class Conta {
	
	private double saldo;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public void saca (double valor){
		this.saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void atualiza (double taxa){
		this.saldo += this.saldo * taxa;
	}
}
