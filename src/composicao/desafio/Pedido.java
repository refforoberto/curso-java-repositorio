package composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	Cliente cliente;
	List<Item> itens = new ArrayList<>();
	
	Pedido(Cliente cliente) {
		this.cliente = cliente;		
	}
	
	double obterValorTotal() {
		
		double valor = 0;
		
		for (Item item : itens) {			
			valor+= item.qtde * item.produto.valor;			
		}
		
		return valor;
		
	}
	
	void adicionarProduto(Produto produto, Integer qtde) {
		this.itens.add(new Item(produto, qtde, this.itens.size() + 1));
	}

}
