public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeContas;
	
	//Adiciona parâmetros ao construtor
	public Conta (int novaAgencia, int novoNumero) {
		totalDeContas++;
		//System.out.println("O total de contas é: " + Conta.totalDeContas);
		
		this.agencia = novaAgencia;
		this.numero = novoNumero;
		
		System.out.println("Estou criando uma conta: " + this.numero);
	}
	
	
	public void deposita(double valor){
		this.saldo = saldo + valor;
	}
	
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque liberado: " + valor);
			return true;
		} else {
			System.out.println("Saldo insuficiente.");
			return false;
		}
	} 
	
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Transfêrencia realizada.");
			return true;
			
		} return false; //else
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	public void setNumero(int novoNumero) {
		if(numero <= 0) {
			System.out.println("Digite um valor maior que 0");
			return; //para aqui
		}
		this.numero = novoNumero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	
	public void setAgencia(int novaAgencia) {
		this.agencia = novaAgencia;
	}
		
	public int getAgencia() {
		return this.agencia;
	}
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}
