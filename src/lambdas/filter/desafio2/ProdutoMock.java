package lambdas.filter.desafio2;

import java.util.Arrays;
import java.util.List;

public abstract class ProdutoMock {

	public static List<Produto> buscarProdutos() {
		return Arrays.asList(new Produto("Televisão", 3000, 0.34, true), new Produto("Microondas", 400, 0.12, false),
				new Produto("Geladeira", 5000.65, 0.4, true), new Produto("Relógio", 30, 0.05, false),
				new Produto("Notebook", 2300, 0.2, true), new Produto("Ar condicionado", 2500, 0.5, true),
				new Produto("Maquina de lavar", 2000, 0.1, false));
	}
}
