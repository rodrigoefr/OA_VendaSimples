
import java.util.ArrayList;
import java.util.Date;

public abstract class Venda {
	
	float precoVenda = 0;
	ArrayList<Item> itens = new ArrayList<Item>(); 
	
	
	public abstract float vender();	
	
	
	public void adicionarItem(Item item){
		itens.add(item);
	}
	
	public void limparItens(){
		itens.clear();
	}
	
	public void imprimirDetalhes(){
		for (Item item : itens) {
			System.out.println(
					"Produto: " + item.produto.getNome() +
					" - Valor: " + item.produto.getValor() +
					" - Quantidade: " + item.quantidade );
		}
		System.out.println("Preço Venda: "+ precoVenda);
		
	}
	
	

}
