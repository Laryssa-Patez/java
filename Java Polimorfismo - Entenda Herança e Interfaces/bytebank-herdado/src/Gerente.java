//Gerente é um Funcionario, Gerente herda da classe funcionario, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	private AutenticaSenha autenticador;
	
	//Construtor
	public Gerente() {
		this.autenticador = new AutenticaSenha();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
	}

	//Autenticação
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


