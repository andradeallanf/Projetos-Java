package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* Main é um método auto executavel em Java */
	public static void main(String[] args) {
		try {
			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha))
					.autenticar()) { /* Se TRUE acessa, se FALSE não acessa */

				List<Aluno> alunos = new ArrayList<Aluno>();

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 5; qtd++) {

					String nome = JOptionPane.showInputDialog("Escreva o nome do aluno " + qtd);

					String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
					/*
					 * String dataNascimento =
					 * JOptionPane.showInputDialog("Escreva a data de nascimento"); String rg =
					 * JOptionPane.showInputDialog("Digite o RG do aluno"); String cpf =
					 * JOptionPane.showInputDialog("Digite o CPF do aluno"); String nomeMae =
					 * JOptionPane.showInputDialog("Nome da Mãe"); String nomePai =
					 * JOptionPane.showInputDialog("Nome do Pai");
					 * 
					 * String dataMatricula = JOptionPane.showInputDialog("Data da matrícula");
					 * String escola = JOptionPane.showInputDialog("Nome da escola"); String serie =
					 * JOptionPane.showInputDialog("Série que o aluno está cursando");
					 */

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);

					aluno1.setIdade(Integer.valueOf(idade));
					
					/*
					 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
					 * aluno1.setRegistroCpf(cpf); aluno1.setNomeMae(nomeMae);
					 * aluno1.setNomePai(nomePai);
					 * 
					 * aluno1.setDataMatricula(dataMatricula); aluno1.setNomeEscola(escola);
					 * aluno1.setSerieCursando(serie);
					 */

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + ":");
						String notaDisciplina = JOptionPane.showInputDialog("Nota" + pos + ":");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover uma disciplina?");

					if (escolha == 0) {

						int continuarRemover = 0;

						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane
									.showInputDialog("Informe o número da disciplina que você deseja remover");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
							continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover outra Disciplina?");
						}
					}

					alunos.add(aluno1);
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {

					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}

				}

				System.out.println("---------- LISTA DE APROVADOS -------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out
							.println(aluno.getNome() + aluno.getAlunoAprovado2() + " média - " + aluno.getMediaNota());
				}

				System.out.println("---------- LISTA DE REPROVADOS -------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out
							.println(aluno.getNome() + aluno.getAlunoAprovado2() + " média - " + aluno.getMediaNota());
				}

				System.out.println("---------- LISTA DE ALUNOS EM EXAME -------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out
							.println(aluno.getNome() + aluno.getAlunoAprovado2() + " média - " + aluno.getMediaNota());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acesso negado");
			}

		} catch (Exception e) {

			StringBuilder saida = new StringBuilder();

			e.printStackTrace(); /* Imprime erro no console Java */

			System.out.println("Mensagem: " + e.getMessage());

			for (int i = 0; i < e.getStackTrace().length; i++) {
				saida.append("\n Classe de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("\n Método de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("\n Erro na linha:  " + e.getStackTrace()[i].getLineNumber());
			}

			JOptionPane.showMessageDialog(null, " Ocorreu um erro inesperado! Desculpe. " + saida.toString());

		}
	}
}
