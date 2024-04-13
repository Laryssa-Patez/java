

public class TestaMetodo {

	public static void main(String[] args) {
		
		//Conta do Paulo
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.saca(150);
		
		//boolean conseguiuRetirar = contaDoPaulo.saca(150); -> Se quiser guardar o return boolean que criamos
		//System.out.println(conseguiuRetirar);  -> Imprime esse retorno boolean
		
		
		//Conta da Marcela
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDoPaulo);
		System.out.println(contaDaMarcela.saldo);
		
		
		//Utilizando if
		//Conta do Gabriel
		Conta contaDoGabriel = new Conta();
		contaDoGabriel.deposita(2000);
		
		if(contaDoGabriel.transfere(300, contaDaMarcela)) {
			
		}  else 
			System.out.println("Saldo insuficiente."); 
		
	}
}
