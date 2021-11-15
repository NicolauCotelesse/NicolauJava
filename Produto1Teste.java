package classeN;

public class Produto1Teste {

	public static void main(String[] args) {
		
		Produto1 p4 = new Produto1("caneta", 20);
		//p4.desconto = .30;
		
		
		System.out.printf("O preço final do item, %s, é R$ %.1f", p4.nome, p4.precoFinal());
	}
}
 