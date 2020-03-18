package colecoes;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetHomogeneo {

	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<>(); // Não mantem a ordem de insercao
		SortedSet<String> lista = new TreeSet<>(); // Mantem a ordem de insercao
		lista.add("Ana");
		lista.add("Roberto");
		lista.add("Kiko");
		
		for(String pessoa : lista) {
			System.out.println(pessoa);
		}
	}
	
}
