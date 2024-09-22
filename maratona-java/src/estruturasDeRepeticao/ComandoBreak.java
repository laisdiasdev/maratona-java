package estruturasDeRepeticao;

public class ComandoBreak {

	public static void main(String[] args) {
		int valorMax = 50;
		for (int i =0; i <=valorMax; i++) {
			if (i > 25) {
				break; // este comando refere-se ao laço for e não à condição if
			}
			
			System.out.println(i);
		}

	}

}
