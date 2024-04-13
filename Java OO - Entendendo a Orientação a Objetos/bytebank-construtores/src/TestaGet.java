
public class TestaGet {
	public static void main(String[] args) {
		Conta conta = new Conta(29883, 1337); //construtor
		
		System.out.println("Agência: " + conta.getAgencia());
		
		System.out.println();
		Conta conta2 = new Conta(19297, 1988); //construtor
		System.out.println("Agência: " + conta.getAgencia());
		
		System.out.println();
		System.out.println("Total de contas: " + Conta.getTotalDeContas());
	}
}
