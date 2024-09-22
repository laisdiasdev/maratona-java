package estruturasDeRepeticao;
	
public class EstruturasDeRepeticao{
	public static void main(String[] args) {
		
		// Estrutura While
		int count = 0;
		while (count < 10) {
			System.out.println(++count);
		}
		
		// Estrutura Do-While
		count = 0;
		do {
			System.out.println(" Dentro do do-while: "+ ++count);
		}while (count < 10);
		
		// Estrutura For
		// declara a var | define o range | faz a alteração
		for(int i = 0; i < 10; i++) {
			System.out.println("For "+i);
		}
	}
}