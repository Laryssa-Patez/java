
public class ContaPoupanca extends Conta {

	//Chama construtor da classe mae
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
