
public class TestaGet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setAgencia(2983);
		System.out.println("Agência: " + conta.getAgencia());
		
		conta.setNumero(1337);
		System.out.println("Número: " + conta.getNumero());
		
		Cliente laryssa = new Cliente();
		laryssa.setNome("Laryssa Patez");
		
		conta.setTitular(laryssa);//Atribu "laryssa" como titular dessa conta
		conta.getTitular().setProfissao("Programador"); //Pega titular e atribui "Programador" como profissao
				
		System.out.println("Titular: " + conta.getTitular().getNome());//Imprime nome do titular da conta
	}
}
