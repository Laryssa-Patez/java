//Cria uma interface
//Um contrato Autenticavel
	//Quem assina esse contrato, precisa implementar o método setSenha e autentica
public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
