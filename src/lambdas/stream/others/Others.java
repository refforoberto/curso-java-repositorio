package lambdas.stream.others;

import java.util.Arrays;
import java.util.List;

import lambdas.Aluno;

public class Others {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Bia", 9.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Zi", 3);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Bia", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Zi", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

		alunos.stream().distinct().forEach(System.out::println);

		System.out.println("\nLimit...");

		alunos.stream().distinct().limit(2).forEach(System.out::println);

		System.out.println("\nSkip...");

		alunos.stream().distinct().skip(2).limit(1).forEach(System.out::println);
		
		System.out.println("\ntakeWhile...");

		alunos.stream().distinct().takeWhile(a -> a.getNota() > 7).forEach(System.out::println);

	}

}
