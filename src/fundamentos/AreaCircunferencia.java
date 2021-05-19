package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 3.4; //atribuindo um valor para uma variável.
		final double pi = 3.14; //colocando o comando final, esta variável se torna constante, dessa forma nenhum outro valor poderá ser atribuido a dela durante o código.
		
//		pi = 1;  //OBS: retire o comentário para ver a mensagem de erro.
		
		
		double area = pi * raio * raio;
		
		System.out.println("área = " + area);
		
		raio = 10; //quando a variável é retomada para atribuir novo valor, o tipo da mesma não é declarado novamente.
		area = pi * raio * raio;
		
		System.out.println("área = " + area);
	}

}
