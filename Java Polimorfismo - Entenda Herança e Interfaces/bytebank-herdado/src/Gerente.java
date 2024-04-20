//Gerente é um Funcionario, Gerente herda atributos da classe Funcionario
public class Gerente extends Funcionario {
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
//	public double getbonificacao() {
//		return this.salario;
//	} 
}


