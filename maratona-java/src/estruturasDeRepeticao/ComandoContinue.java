package estruturasDeRepeticao;

public class ComandoContinue {
	// Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
	// Condição valorParcela >= 1000
	
	public static void main(String[] args) {
		int valorTotal = 30000;
		for (int parcela = valorTotal; parcela >= 1; parcela--) {
						// aqui, valorTotal foi forçado a ser int, usando casting
			double valorParcela = valorTotal / parcela;
			if (valorParcela < 1000) {
				continue;
			}
			System.out.println("Parcela "+ parcela + " R$ "+ valorParcela);	
		}
				
	}

}
