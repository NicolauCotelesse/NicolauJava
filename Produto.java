package classeN;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto() {
		return (preco * (1-desconto));
		
	}
	
	Produto () {}
	
	Produto(String nomeItem) {
		nome = nomeItem;
	}
	
	Produto(String nomeItem, double precoInicial) {
		preco = precoInicial;
		nome = nomeItem;
	}
	
	Produto(String nomeItem1, double precoI, double descontoInicial) {
		nome = nomeItem1;
		preco = precoI;
		desconto = descontoInicial;
				
	}
	 
	

}
