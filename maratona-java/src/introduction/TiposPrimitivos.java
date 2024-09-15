package introduction;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// int, double, float, char short, long, boolean
		// atentar-se ao tamanho em memória
		
		int idade = 18;
		double salarioDouble = 2000;
		float slarioFloat = 2500;
		byte idadeByte = 18;
		short idadeShort = 18;
		boolean verdadeiro = true;
		boolean falso = false;
		char caractere = '\u0041'; // para uma letra, mas também pode ser um código ASCII
				
		System.out.println("A idade é "+idade+" anos");
		System.out.println(falso);
		System.out.println("char "+caractere);
		}
}
