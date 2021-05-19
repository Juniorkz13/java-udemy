package classe;

public class AreaCirc {

	double raio;
	static final double pi = 3.14; // não é mais possível alterar o valor de pi.
	double piERRADO;

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	double area() {
		return raio * raio * pi;
	}
	
	static double area(double raio) {
		return raio * raio * pi;
	}

}
