
public class Cliente implements Autenticavel {

	private AutenticaSenha autenticador;
	
	//Construtor
	public Cliente() {
		this.autenticador = new AutenticaSenha();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}

}
