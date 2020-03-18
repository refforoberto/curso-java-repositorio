package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdAlunos = s.nextInt();
		
		System.out.println("Quantas notas por aluno ");
		int qtdNotas = s.nextInt();
		
		double [][]notasTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;		
		for (int i = 0; i < notasTurma.length; i++) {			
			for (int j = 0; j < notasTurma[i].length; j++) {			
				System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
				notasTurma[i][j] = s.nextDouble();				
				total += notasTurma[i][j];				
			}			
		} 		
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("A média da turma é: " + media);
		
		s.close();
	}
}
