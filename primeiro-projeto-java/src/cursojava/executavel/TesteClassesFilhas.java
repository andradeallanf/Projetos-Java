package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TesteClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Allan");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Aldo");
		diretor.setIdade(45);
		diretor.setRegistroGeral("515.1.651651");
		
		Secretario secretario = new Secretario();
		
		secretario.setNome("Wilson");
		secretario.setExperiencia("Adiministrador");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.salario());
		System.out.println(diretor.salario());
		System.out.println(secretario.salario());
		System.out.println(diretor.pessoaMaiorIdade());
	}

}
