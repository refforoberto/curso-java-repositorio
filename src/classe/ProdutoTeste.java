package classe; 

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Sapato", 100);
		
		Produto.desconto = 0.26;
		Produto p2 = new Produto("Bolsa", 100);
		
		
		System.out.println( p1.nome + " " + p1.valor + " "+  p1.valorComDesconto);
		System.out.println( p2.nome + " " + p2.valor + " "+  p2.valorComDesconto);

	}

}
