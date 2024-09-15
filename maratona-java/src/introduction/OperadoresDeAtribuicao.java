package introduction;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		// são eles: =, +=, -=, /=, %=
		
		double bonus = 1800; //1800
		bonus += 1000; //2800
		bonus -= 1000; // 1800
		bonus *= 2;
		bonus /= 2;
		bonus %= 2;
		System.out.println("Atribuições comuns: ");
		System.out.println(bonus);
		
		// outras maneiras: ++, --
		int contador = 0;
		contador += 1; // contador = contador +1 = 
		contador++; // 2
		contador--; // 1
		// cuidado, pois a ordem da atribuição influencia no resultado
		++contador; // 2
		--contador; // 1
		System.out.println("Atribuições alternativas: ");
		System.out.println(contador);
		
		/* qunado o operador vem depois, a intenção é que primeiro
		seja executada a variável para depois ser atribuido um valor
		a ela. quando o operador vem antes da variável, ocorre o contrário*/
		
		int contador2 = 0;
		System.out.println(contador2++);
		System.out.println(contador2);
	}

}
