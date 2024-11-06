package estruturasDeDados;

public class ArraysMultidimensionais02 {

	public static void main(String[] args) {

		int[][] dias = new int[3][3];

		dias[0][0] = 31;
		dias[0][1] = 28;
		dias[0][2] = 31;

		dias[1][0] = 31;
		dias[1][1] = 28;
		dias[1][2] = 31;


		// Usando for each
		for(int[] arrBase: dias) {
			for(int num: arrBase) {
				System.out.println(num);
			}
		//arrBase é uma variável de referência que só existe durante a execução do laço
		}
	}

}
