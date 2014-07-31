package ExemploDeContaBancaria;

public class AtualizadorDeConta {
	
	private double saldoTotal = 0;
	
	private double selic;
	
	public void AtualizadorDecontas(double selic){
		this.selic = selic;
	}
	
	public void roda(conta c){
		
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}
	
	

}
