package arrays;

import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantas notas deseja digitar?");
		int qtdNotas = s.nextInt();
		
		
		double[] notas =  new double[qtdNotas]; 
		
		
		for (int i = 0; i < notas.length; i++) {			
			System.out.println("Digite a nota " + (i + 1) + " de " + notas.length);
			double nota = s.nextDouble();
			notas[i] = nota ;			
		}
		
		
		double total = 0;
		for(double nota: notas) {
			total+=nota;
		}
		
		System.out.println(" A média do aluno é: " + total / notas.length);
		
		s.close();
		
		
	}

}
