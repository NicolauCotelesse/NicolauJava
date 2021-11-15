package classeN;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro c1 = new Carro("Civic", "azul", 110000.00, .12);
		Carro c2 = new Carro("Civic", "amarelo");
		
		System.out.printf("O carro %s, %s, custa o valor final R$ %.2f \n", c1.nome, c1.cor, c1.valor);
		System.out.printf("Com o desconto de %.0f por cento concedido, o valor final será de R$ %.2f \n", c1.desconto*100, c1.precoDesconto());
		System.out.println("O carro " + c2.nome + " é da cor " + c2.cor);		
				
	}

}
