package classeN;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		var p2 = new Produto("Celular", 1500);
		Produto p3 = new Produto("Ipad", 5500, .2);
		
		p1.nome = "Notebook";
		p1.preco = 4000;
		p1.desconto = 0.15;
		
		//p2.preco = 1000;   se eu tirar o //  vai prevalecer o valor 1000 para p2
		p2.desconto = .5;
		
		
		
		
		
		
		System.out.printf("O item %s, tem o valor final de R$ %.2f \n", p1.nome, p1.precoComDesconto());
		System.out.printf("O item %s, tem o valor final de R$ %.2f \n", p2.nome, p2.precoComDesconto());
		System.out.printf("O item %s, tem o valor final de R$ %.2f", p3.nome, p3.precoComDesconto());
		
	}

}
