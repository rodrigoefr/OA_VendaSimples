
import java.util.Date;

public class VendaAP extends Venda{

	private Date dataPagamento;
	
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


	@Override
	public float vender() {
		
		for (Item item : itens) {
			this.precoVenda += item.produto.getValor() * 
					item.quantidade;
		}
		
		this.precoVenda = this.precoVenda + 100;
		
		return this.precoVenda;
	}
	
	
	public void imprimirDetalhes(){
		super.imprimirDetalhes();
		System.out.println("Obs: a venda a prazo possui 100 reais de acrescimo");
		if (this.dataPagamento == null){
			System.out.println("Data de pagamento nula, favor preencher");
		
		}else{
			System.out.println("Data de pagamento: "+this.dataPagamento);
		}
	}
		

	
}
