package lambdas.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

//1) tranformar numero em string binaria
//2) Inverter string
//3) coonverter para interiro
public class DesafioMap { 
	public static void main(String[] args) {
		
		Consumer<Integer> print = System.out::println;
		
		Function<String, Integer> convertBinaryStringToInteger = bs -> Integer.parseInt(bs, 2);
		UnaryOperator<String> toInvertString = str ->  new StringBuilder(str).reverse().toString(); 
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);  
		
		numbers.stream()
		.map(Integer::toBinaryString)
		.map(toInvertString)
		.map(convertBinaryStringToInteger)
		.forEach(print);		
	}
}
