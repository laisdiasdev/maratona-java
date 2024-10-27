package estruturasDeDados;

public class Arrays02 {

	public static void main(String[] args) {
		// Diferentes tpos de inicialização de arrays.
		// byte, short, int, long, float e double são INICIALIZADOS COM 0
		// char: ' ' (espaço ou unicode)
		// boolean: false
		// String: null
		
		String[] exemplo = new String[3];
		System.out.println(exemplo[0]);
		System.out.println(exemplo[1]);
		System.out.println(exemplo[2]);
		System.out.println("");
		
		boolean[] exemplo2 = new boolean[3];
		System.out.println(exemplo2[0]);
		System.out.println(exemplo2[1]);
		System.out.println(exemplo2[2]);
		System.out.println("");
		
		char[] exemplo3 = new char[3];
		System.out.println(exemplo3[0]);
		System.out.println(exemplo3[1]);
		System.out.println(exemplo3[2]);
		System.out.println("");
				
		long[] exemplo4 = new long[3];
		System.out.println(exemplo4[0]);
		System.out.println(exemplo4[1]);
		System.out.println(exemplo4[2]);
		System.out.println("");

	}

}
