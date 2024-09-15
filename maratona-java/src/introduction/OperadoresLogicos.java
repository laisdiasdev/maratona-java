package introduction;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// São eles: && (AND), || (OR), 
		
		int idade = 25;
		float salario = 4500;
		boolean proposicao1 = idade > 20 && salario >= 6000;
		boolean proposicao2 = idade < 30 && salario >= 2500;
		boolean proposicao3 = idade >=25 || salario <= 1500;
		
		System.out.println("proposicao1: "+proposicao1);
		System.out.println("proposicao2: "+proposicao2);
		System.out.println("proposicao3: "+proposicao3);
	}

}
