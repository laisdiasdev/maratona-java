package estruturasCondicionais;

public class ElseIF {

	public static void main(String[] args) {
		
		int nota1 = 5;
		int nota2 = 9;
		double media = (nota1 + nota2)/2;
		
		if (media >= 7) {
			System.out.println("Aprovado!");
		}else if(media >= 3 & media <= 6){
			System.out.println("Deve fazer recuperação");
		}else {
			System.out.println("Reprovado");
		}
		

	}

}
