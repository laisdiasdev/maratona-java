package estruturasDeDados;

public class ArraysMultidimensionais03 {

	public static void main(String[] args) {
		
		int[][] arrayInt = new int[3][];
		
		arrayInt[0] = new int[] {1,3,2};
		arrayInt[1] = new int[] {98,43,21,33};
		arrayInt[2] = new int[] {5,6,3,2};
		
		for(int[] arrayBase:arrayInt) {
			System.out.println("=====");
			for(int num:arrayBase) {
				System.out.println(num + "");
				
				//OBS.: existem outras formas de declarar arrays
			}
		}

	}

}
