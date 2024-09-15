package introduction;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		// São eles: <, >, <=, >=, ==, !=
		
		boolean isDezMaiorQueVinte = 10 >= 20;
		boolean isDezMenorQueVinte = 10 <= 20;
		boolean isDezIgualVinte = 10==20;
		boolean isDezDiferenteVinte = 10!=20;
		
		
		System.out.println("10 é maior do que 20? "+isDezMaiorQueVinte);
		System.out.println("10 é menor do que 20? "+isDezMenorQueVinte);
		System.out.println("Dez é igual a 20? "+isDezIgualVinte);
		System.out.println("Dez é diferente de 20? "+isDezDiferenteVinte);
		
	}
}
