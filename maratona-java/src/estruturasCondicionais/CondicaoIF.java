package estruturasCondicionais;

public class CondicaoIF {

	public static void main(String[] args) {
		
		int idade = 15;
		boolean isMaiorDeIdade = idade >= 18; //true
		
		if(isMaiorDeIdade) {
			System.out.println("Pode consumir álcool.");
		}
		
		if(!isMaiorDeIdade) {
			System.out.println("Não pode consumir álcool.");
		}
		
		System.out.println("Fora do if");
		
	}

}
