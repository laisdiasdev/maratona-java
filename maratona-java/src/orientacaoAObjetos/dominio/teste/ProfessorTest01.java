package orientacaoAObjetos.dominio.teste;

import orientacaoAObjetos.dominio.Professor;

public class ProfessorTest01 {

	public static void main(String[] args) {
		
		Professor professor = new Professor();
		
		professor.nome = "João";
		professor.idade = 43;
		professor.sexo = 'M';		
		
		System.out.println("Nome do professor(a): "+ professor.nome +
							", Idade do professor(a): "+ professor.idade +
							", Sexo do profesor(a): "+ professor.sexo);
	}

}
