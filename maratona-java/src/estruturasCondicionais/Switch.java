package estruturasCondicionais;

public class Switch {

	public static void main(String[] args) {
		// Imprima o dia da semana, considerando 1 como domingo
		
		byte dia = 5;
		
		// Switch não aceita double nem float
		switch (dia) {
			default:
				System.out.println("Opção inválida"); // o default não precisa estar na primeira linha
				break;
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
		}

	}

}
