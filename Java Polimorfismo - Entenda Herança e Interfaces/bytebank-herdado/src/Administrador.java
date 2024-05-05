
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticaSenha autenticador;

	//Construtor
	public Administrador() {
		this.autenticador = new AutenticaSenha();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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
