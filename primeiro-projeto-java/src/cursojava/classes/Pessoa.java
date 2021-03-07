package cursojava.classes;

public abstract class  Pessoa { // abstract impede que a superclass seja instanciada
	/*Herança, as classes filhas da classe pessoa herdam os atributos 
	 * Classe pai, classe master ou superclasse 
	 * (atributos comuns a todos os objetos filhos */
	protected String nome;
	protected int idade; 
	protected String dataNascimento;
	protected String registroGeral;
	protected String registroCpf;
	protected String nomePai;
	protected String nomeMae;
	
	
	/*Se a pessoa é maior de 18 retorna true, se não false  */
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	
	//public void pessoaMaiorIdade;
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", registroCpf=" + registroCpf + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae
				+ "]";
	}
	
	public abstract double salario(); /* tornar um método abstrato faz com que seja obrigatório 
	escreve-lo em todas as classes filhas.
	*/
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

	
	
	
	

}
