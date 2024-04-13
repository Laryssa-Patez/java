
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.saldo);
		
		
		//Não compila pois precisamos criar o cliente e atribuir a titular
		contaDaMarcela.titular.nome =  "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}
