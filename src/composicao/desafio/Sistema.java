package composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new Cliente("1", "Roberto"));
		
		pedido.adicionarProduto(new Produto("Camiseta", 68.77), 1);
		pedido.adicionarProduto(new Produto("Meia    ", 5), 4);
		pedido.adicionarProduto(new Produto("Bermuda ", 55.45), 2);
		
		
		System.out.println("Detalhes do pedido");
		System.out.println("Lista de itens");
		for (Item item : pedido.itens) {
			System.out.println("Seq: " + item.sequencia.toString() + 
					" Produto: " + item.produto.nome + " Valor: " + item.produto.valor + 
					" Quantidade: " + item.qtde);
		}
		System.out.println("----------------------");
		System.out.println("Valor total do pedido: R$" + pedido.obterValorTotal());
		
	}
	

	

}
