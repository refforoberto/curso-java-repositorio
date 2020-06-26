package exceptions;

import lambdas.Aluno;

public class Cause {
	public static void main(String[] args) {
		try {
			methodA(null);
		} catch (Exception e) {			
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			} 
		}
	}

	public static void methodA(Aluno aluno) {		
		try {
			methodB(aluno);
		} catch (Exception cause) {
			throw new IllegalArgumentException(cause);
		}

	}

	public static void methodB(Aluno aluno) {		
		if (aluno == null) {
			throw new NullPointerException("The student has a NULL value");
		}
		
		System.out.println(aluno.getNome());
	}
}
