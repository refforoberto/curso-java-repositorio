package composicao.desafio;

public class Item {
	Integer sequencia;
	Produto produto;
	Integer qtde;
	
	Item(Produto produto, Integer qtde, Integer sequencia) {
		this.sequencia = sequencia;
		this.produto = produto;
		this.qtde = qtde;
	}
	

}
