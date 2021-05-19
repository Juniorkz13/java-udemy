package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(10);
		
//		AreaCirc.pi = 15; // não é possível alterar o valor de pi.
		
		System.out.println(a.area());
		System.out.println(AreaCirc.pi);
		
		System.out.println(AreaCirc.area(100)); // calculando a área através do método, sem criar nenhuma instância.

	}

}
