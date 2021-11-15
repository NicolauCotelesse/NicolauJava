package classeN;

public class Carro {
	
	String nome;
	String cor;
	double valor;
	double desconto;

	
	Carro(String nomeCarro, String corCarro, double valorCarro, double descontoOferecido){
		nome = nomeCarro;
		cor = corCarro;
		valor = valorCarro;
		desconto = descontoOferecido;
	}
	
	Carro(String nomeCarro, String corCarro) {
		nome = nomeCarro;
		cor = corCarro;
		
	}
	
	double precoDesconto() {
		return (valor * (1-desconto));
	}

}