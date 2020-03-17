package desafio.modulo.classes;

public class Jantar {

	public static void main(String[] args) {

		Comida c1 = new Comida("Arroz", 0.7);
		Comida c2 = new Comida("Macarrão", 0.5);
		
		
		Pessoa p = new Pessoa("João", 97.6);
		
		System.out.printf("Peso do %s é %s \n", p.nome, p.peso);
		
		p.comer(c1);
		p.comer(c2);
		
		System.out.printf("Após o jantar, o peso do %s é %s", p.nome, p.peso);
		
	}

}
