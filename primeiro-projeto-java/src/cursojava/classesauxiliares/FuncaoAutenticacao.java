package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Somente receber alguém que tem o contrato da interface de PermitirAcesso
	 * então, chamar o autenticar acesso*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;	
	}
	

}
