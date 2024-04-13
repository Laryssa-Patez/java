

public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 500;
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(segundaConta); //Imprime referência da variável primeiraConta
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 200;
		
		System.out.println(segundaConta.saldo); 
		System.out.println(primeiraConta.saldo);
		
		//Verifica se é a mesma conta
		if(primeiraConta == segundaConta) { //Compara a referência de cada variável 
			System.out.println("É a mesma conta");
		}
	}
}
