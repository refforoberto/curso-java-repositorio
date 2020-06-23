package lambdas.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Reduce1 {


	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		BinaryOperator<Integer> soma = (acc, n) -> acc + n;	
		
		Predicate<Integer> maiorQueCinco= n -> n > 10;
		
		Integer total = nums.stream().reduce(soma).get();

		System.out.println(total);

		Integer total2 = nums.stream().reduce(100, soma);

		System.out.println(total2);

		nums.stream()
				.filter(maiorQueCinco)
				.reduce(soma)
				.ifPresent(System.out::println);

	}

}
