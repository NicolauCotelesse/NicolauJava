package classeN;

public class Produto1 {
	
	String nome;
	double preco;
	static double desconto = .25;
	
	double precoFinal (){
		return preco * (1-desconto);
	}
	
	
	Produto1(){}

	Produto1(String nomeProduto1, double precoProduto1){
		nome = nomeProduto1;
		preco = precoProduto1;
	}

}
