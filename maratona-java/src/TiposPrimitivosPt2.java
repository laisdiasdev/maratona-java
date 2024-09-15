
public class TiposPrimitivosPt2 {

	public static void main(String[] args) {
		// casting é uma maneira de forçar um tipo primitivo de dados para outro.
		
		int idade = 10;
		long numeroGrande = 35600000L;
		
		// forçando um número inteiro virar um long;
		int num = (int)23000000000L;
		System.out.println("Número inteiro forçado: "+num);
		
		// a impressão será um número diferente, pois o casting "cortou" os bits para que coubessem no int 
		
		}

}
