package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

//Essa é a classe/objeto que representa o aluno
/*Classe filha da classe Pessoa*/ 
public class Aluno extends Pessoa {
	
	// Esses são os atributos do aluno
	private String dataMatricula;
	private String nomeEscola;
	private String serieCursando;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	/*
	 * SET é para adicionar ou receber dados para os atributos O SET sempre terá o
	 * void, por que ele não retorna nada, apenas atribui valores.
	 */

	/*
	 * GET serve para resgatar ou obter o valor do atributo O GET sempre terá o
	 * 'return', ou seja, sempre retorna alguma coisa.
	 */
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() { // Cria os dados na memória - Esse é o padrão do Java

	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getRegistroCpf() {
		return registroCpf;
	}

	public void setRegistroCpf(String registroCpf) {
		this.registroCpf = registroCpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieCursando() {
		return serieCursando;
	}

	public void setSerieCursando(String serieCursando) {
		this.serieCursando = serieCursando;
	}

	// Método que retorna média do aluno
	public double getMediaNota() {

		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		return somaNotas / disciplinas.size(); // o .size nos diz quantos elementos existem dentro de uma lista.
												// .size substitui o número de elementos em um calculo de média por
												// exemplo
	}

	// Método que verifica se o aluno está ou não aprovado
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		{
			if (media >= 50) {
				if (media >= 70) {
					return StatusAluno.APROVADO;
				} else {
					return StatusAluno.RECUPERACAO;
				}
			} else {
				return StatusAluno.REPROVADO;
			}
		}

	}

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieCursando="
				+ serieCursando + ", disciplinas=" + disciplinas + ", nome=" + nome + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral + ", registroCpf="
				+ registroCpf + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((registroCpf == null) ? 0 : registroCpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (registroCpf == null) {
			if (other.registroCpf != null)
				return false;
		} else if (!registroCpf.equals(other.registroCpf))
			return false;
		return true;
	}

	@Override
	public double salario() {
		return 1500.00;
	}

}
