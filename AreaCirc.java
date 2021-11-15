package classeN;

public class AreaCirc {

	double raio;
	final static double PI = 3.1415;
	
	
	AreaCirc (double raioInicial) {
		raio = raioInicial;
	}
	
	AreaCirc () {}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
}
