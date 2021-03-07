package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Somente receber algu�m que tem o contrato da interface de PermitirAcesso
	 * ent�o, chamar o autenticar acesso*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;	
	}
	

}
