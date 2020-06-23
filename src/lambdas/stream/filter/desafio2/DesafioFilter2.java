package lambdas.stream.filter.desafio2;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

	public static void main(String[] args) {
		List<Produto> produtos = ProdutoMock.buscarProdutos();

		Predicate<Produto> descontoMaiorQueTrinta = p -> p.desconto > 0.3;
		Predicate<Produto> freteGratis = p -> p.freteGratis;	
		Function<Produto, String> mensagem = p -> "O produto " + p.nome + " está em promoção e com frete gratis";
		
		produtos.stream()
		        .filter(descontoMaiorQueTrinta)
		        .filter(freteGratis)
		        .map(mensagem)
		        .forEach(System.out::println);

	}

}
