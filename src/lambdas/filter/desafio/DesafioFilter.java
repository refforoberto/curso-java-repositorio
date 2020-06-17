package lambdas.filter.desafio;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		List<Instrumento> instrumentos = InstrumentoMock.retornarInstrumentos();

		Predicate<Instrumento> instrumentoCordas = i -> i.getCategoria() == Categoria.CORDAS;
		Predicate<Instrumento> instrumentoRitmo = i -> i.getCategoria() == Categoria.RITMO;
		Predicate<Instrumento> instrumentoCaro = i -> i.getPreco() >= 750;
		Predicate<Instrumento> instrumentoBarato = i -> i.getPreco() < 800;
		Function<Instrumento, String> mensagem = i -> " O instrumento " + i.getNome() + " - " + i.getDescricao()
				+ ", custa R$" + i.getPreco();

		System.out.println("Instrumentos de corda caros");
		instrumentos.stream().filter(instrumentoCordas).filter(instrumentoCaro).map(mensagem)
				.forEach(System.out::println);
		
		System.out.println("\nInstrumentos de corda baratos");
		instrumentos.stream().filter(instrumentoCordas).filter(instrumentoBarato).map(mensagem)
		.forEach(System.out::println);
		
		System.out.println("\nInstrumentos de ritmo");
		instrumentos.stream().filter(instrumentoRitmo).map(mensagem)
		.forEach(System.out::println);

	}

}
