
public class TestaSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200));//Chama o método e imprime o retorno do método: true ou false 
		
		System.out.println(conta.mostraSaldo());
	}
}
