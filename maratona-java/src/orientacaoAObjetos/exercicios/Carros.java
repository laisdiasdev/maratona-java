package orientacaoAObjetos.exercicios;

public class Carros extends Carro {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		carro1.nome = "Fiat Argo";
		carro1.ano = 2022;
		carro1.modelo = "Hatch";
		
		carro2.nome = "Hilux";
		carro2.ano  = 2010;
		carro2.modelo = "Picape";
		
		System.out.println(carro1.nome);
		System.out.println(carro1.modelo);
		System.out.println("============");
		System.out.println(carro2.nome);
		System.out.println(carro2.modelo);
	}

}
