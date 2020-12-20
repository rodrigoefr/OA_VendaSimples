
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Principal {

	public static void main(String[] args) throws ParseException {
		//venda a vista
		System.out.println("**Venda a vista:");
		Produto pr1 = new Produto("Caderno", 10);  //nome e valor
		Produto pr2 = new Produto("Caneta", (float)2.50 );
		
		Item it1 = new Item(pr1, 2);  //produto e quantidade
		Item it2 = new Item(pr2, 5);
		
		VendaAV aVista = new VendaAV();
		aVista.adicionarItem(it1);
		aVista.adicionarItem(it2);
		aVista.vender();
		aVista.imprimirDetalhes();
		
		//venda a prazo -> necessita obrigatoriamente de data de pagamento agendada
		System.out.println("");
		System.out.println("**Venda a prazo:");
		
		Produto pn1 = new Produto("Computador", 1000);  //nome e valor
		Produto pn2 = new Produto("Mochila", 23);  //nome e valor
		
		Item i1 = new Item(pn1, 1);  //produto e quantidade
		Item i2 = new Item(pn2, 2);
		
		VendaAP aPrazo = new VendaAP();
		aPrazo.adicionarItem(i1);
		aPrazo.adicionarItem(i2);
		aPrazo.vender();
		DateFormat f = DateFormat.getDateInstance();
		Date data1 = f.parse("22/01/2022");
		 
		//aPrazo.setDataPagamento(data1);
		aPrazo.imprimirDetalhes();		
	}
}