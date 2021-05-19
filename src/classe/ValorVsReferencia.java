package classe;


public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor.
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		DesafioData d1 = new DesafioData(1, 6, 2022); 
		DesafioData d2 = d1; // atribuição por referência (Objeto).
		
		d1.dia = 31;
		d2.mes = 03;
		d1.ano = 1992;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		voltarDataParaValorPadrao(d1);

		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c); // o valor não é alterado pois o valor passado para int c não foi uma referência e sim uma cópia.
	}
	
	static void voltarDataParaValorPadrao(DesafioData d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1111;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}

}
