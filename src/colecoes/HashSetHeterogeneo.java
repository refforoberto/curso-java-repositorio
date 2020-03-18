package colecoes;

import java.util.HashSet;
import java.util.Set;

public class HashSetHeterogeneo {

	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static void main(String[] args) {

		Set conjunto = new HashSet<>();	
		
		conjunto.add(false);
		conjunto.add(1);
		conjunto.add("Teste");
		conjunto.add(1.2);
		conjunto.add('x');
		
		System.out.println("Tamanho do conjunto é: " + conjunto.size());
		
		// NAO ADICIONA ELEMENTOS REPETIDOS
		conjunto.add("Teste");
		conjunto.add('x');
		
		System.out.println("Tamanho do conjunto é: " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho do conjunto é: " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(conjunto);
		System.out.println(nums);
		
		//conjunto.addAll(nums);
		//System.out.println("União: " + conjunto);
		
		conjunto.retainAll(nums);
		System.out.println("Interceção: " + conjunto);
		
		conjunto.clear();
		System.out.println("Clear: " + conjunto);
		
		
	}

}
