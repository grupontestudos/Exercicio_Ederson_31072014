package ExercicioEderson05;

public class ExercicioDeson05 {
	public static void main(String[] args) {
		
		String nomeAluno = "Ederson o pegador";
		
		double notaMatematica = 8.5;
		
		double notaPortugues = 9;
		
		double notaFisica = 10;
		
		double mediaNota = (notaMatematica + notaPortugues + notaFisica) / 3;
		
		System.out.println("O nome do aluno é " + nomeAluno);
		System.out.println("A nota da prova de Matemática foi de " + notaMatematica);
		System.out.println("A nota da prova de Português foi de " + notaPortugues);
		System.out.println("A nota da prova de Física foi de "+ notaFisica);
		System.out.println();
		System.out.println();
		System.out.println("A média do aluno " + nomeAluno + " foi de " + mediaNota);
	}

}
