package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.println("Buscar dados do console...");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.printf("Digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.printf("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		
		System.out.printf("\n Meu nome é %s %s e tenho %d anos de idade", nome, sobrenome, idade);
		
		
		
		
		
		scanner.close();
		
	}

}
