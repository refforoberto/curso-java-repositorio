package lambdas.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import lambdas.Aluno;

public class Reduce3 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Bia", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Zi", 10);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
		Function<Aluno, Double> apenasNota = a -> a.getNota();
		BiFunction<Media, Double, Media> calcularMedia = (media , valor) -> media.adicionar(valor);
		
		// Obrigatório para o reduce
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);
		
		Media mediaTotal = alunos.stream()
				.filter(aprovado)
				.map(apenasNota)
				.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println(mediaTotal.getValor());		

	}

}
