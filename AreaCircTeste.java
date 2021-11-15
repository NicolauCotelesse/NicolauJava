package classeN;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc Circ1 = new AreaCirc();
		Circ1.raio = 10;
		
		System.out.printf("A área do Circ1 é %.2f \n", Circ1.area());
		
		AreaCirc a2 = new AreaCirc(1000);
		//a2.PI = 100;
		
		System.out.println("A Area de a2 é: " + a2.area());
		
	}

}
