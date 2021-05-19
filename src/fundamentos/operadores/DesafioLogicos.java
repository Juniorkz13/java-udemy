package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {

		// trabalho na terça (v ou f).
		// trabalho na quinta (v ou f).
		
		boolean t1 = true;
		boolean t2 = false;
		
		if (t1 && t2) {
			System.out.println("2 trabalhos certos, comprou TV de 50\".\n");
		}
		if (t1 && !t2 || !t1 && t2) {
			System.out.println("1 trabalho certo, comprou TV de 32\".\n");
		}
		if (!t1 && !t2) {
			System.out.println("família em casa, não comprou TV.\n");
		}
		if (t1 || t2) {
			System.out.println("qualquer trabalho certo a família sai para tomar sorvete.\n");
		}
			
		

	}

}
