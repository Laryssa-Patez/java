
public class TesteContas {

	public static void main(String[] args) {
		
		//utilizando métodos herdados da classe mãe
		ContaCorrente cc1 = new ContaCorrente (111, 111);
		cc1.deposita(100);
		
		ContaPoupanca cp1 = new ContaPoupanca(222, 222);
		cp1.deposita(200);	
		
		cc1.transfere(10.0, cp1);
		
		cc1.saca(10);
		
		System.out.println("Saldo CC1: " + cc1.getSaldo());
		
		System.out.println("Saldo CC2: " + cp1.getSaldo());
		
	}	
}
