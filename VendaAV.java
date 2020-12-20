
public class VendaAV extends Venda{

	@Override
	public float vender() {
		for (Item item : itens) {
			this.precoVenda += item.produto.getValor() *
					item.quantidade;
		}
		
		return this.precoVenda;
	}

	
}
