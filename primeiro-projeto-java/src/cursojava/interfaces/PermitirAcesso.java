package cursojava.interfaces;
/*Esta interface ser� o nosso contrato de autentica��o*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login, String senha);/*Apenas declara��o do m�todo*/
	public boolean autenticar ();
}
