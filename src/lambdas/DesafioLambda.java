package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda {

	public static void main(String[] args) {
		
		Produto prod = new Produto("Ipad", 3235.89, 0.13);
		
		Function<Produto, Double> calcularPrecoComDesconto = p -> p.preco * (1  -  p.desconto);
		
		UnaryOperator<Double> calcularPrecoComImposto = p -> p >=2500 ? p + (p * 0.085) : p;
		
		UnaryOperator<Double> calcularPrecoComFrete  = p -> p >=3000 ? p + 100 : p + 50;
		
		UnaryOperator<Double> arredondar  = p -> Double.parseDouble(String.format("%.2f", p).replace(",", "."));
		
		Function<Double, String> formatar = p -> ("R$" + p).replace(".", ",");
		
		
		String resultado = calcularPrecoComDesconto
				.andThen(calcularPrecoComImposto)
				.andThen(calcularPrecoComFrete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(prod);
		
		System.out.println(resultado);
		
		
	}
	
}
