package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "José Couve";
		u1.email = "couvinha2009@bol.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "José Couve";
		u2.email = "couvinha2009@bol.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2 == u1);
		System.out.println(u2.equals(u1));

	}
}
