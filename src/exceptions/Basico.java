package exceptions;

import lambdas.Aluno;

public class Basico {
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		} catch (Exception e) {
			System.out.println("Erro ao imprimir nome do aluno");
		}
		

		try {
			System.out.println( 7 / 0 );
		} catch (ArithmeticException ae) {
			System.out.println("Ocorrreu erro:" + ae.getMessage());
		}
		
		System.out.println("fim!!");
		
		
	}
	
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.getNome());
		
	}
	
	
	
	
}
