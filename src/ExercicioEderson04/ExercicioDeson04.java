package ExercicioEderson04;

public class ExercicioDeson04 {
	public static void main(String[] args) {
		
		String nomeVendedor = "Ederson o Gostosão";
		
		double salarioFixo = 750;
		
		int numeroVendas = 200;
		
		double salarioComissao = numeroVendas *(1- 0.85) + salarioFixo;
		
		System.out.println("O nome do vendedor é " + nomeVendedor);
		System.out.println("O salário do vendedor é de " + salarioFixo);
		System.out.println("O valor de vendas do vendedor é de " + numeroVendas);
		System.out.println();
		System.out.println();
		System.out.println("O salário final do vendedor é de " + salarioComissao);
	}

}
