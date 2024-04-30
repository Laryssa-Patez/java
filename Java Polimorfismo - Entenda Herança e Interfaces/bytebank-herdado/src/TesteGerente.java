
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("120-192-293-02");
		g1.setSalario(5000.0);
		
		System.out.println("Nome: " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		System.out.println("Salário: " + g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println("Autencicação: " + autenticou);
		
		System.out.println("Bonificação: " + g1.getbonificacao());
		
		
	}
}
