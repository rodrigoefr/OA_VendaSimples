

public class Item {

	Produto produto;
	int quantidade;

	public Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
}
