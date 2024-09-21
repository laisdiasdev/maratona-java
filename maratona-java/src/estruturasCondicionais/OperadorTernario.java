package estruturasCondicionais;

public class OperadorTernario {

	public static void main(String[] args) {
		// Fazer doações, se salário > 5000
		double salario = 6000;
		String mensagemDoar = "Eu vou doar 500 reais pra caridade";
		String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
		
		// Sintaxe de um operador ternário: (condicao) ? verdadeiro : falso
		String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
		
		System.out.println(resultado);
	}

}
