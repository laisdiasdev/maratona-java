package estruturasDeDados;

public class Array4 {

	public static void main(String[] args) {
		// Outras maneiras de inicializar Arrays
		
		int[] numeros = new int[3];
		int[] numeros2 = {1,2,3,4,5};
		int[] numeros3 = new int[]{1,2,3,4,5};
		
		for (int i =0; 1< numeros2.length; i++) {
			System.out.println(numeros[i]);
		}
		
		// usando foreach
		//num = 0;
		for (int num : numeros3) {
			System.out.println(num);
		}
	}

}
