package classes;

public class Produto {
	String nome;
	double valor;
	double valorComDesconto;
	
	static double desconto = 0.25;
	
	
	Produto( String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		this.valorComDesconto = valor * (1 - desconto);		
	}
	
}
