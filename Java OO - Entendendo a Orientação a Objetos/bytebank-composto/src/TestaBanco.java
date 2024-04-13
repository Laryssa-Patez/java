
public class TestaBanco {

	public static void main(String[] args) {
		Cliente laryssa = new Cliente();
		
		laryssa.nome = "Laryssa Patez";
		laryssa.cpf = "333.333.333-33";
		laryssa.profissao = "Programador";
		
		Conta  contaDaLaryssa = new Conta();
		contaDaLaryssa.deposita(200);
		
		//Associa a cliente Laryssa a conta contaDaLaryssa
		contaDaLaryssa.titular = laryssa;
		System.out.println(contaDaLaryssa.titular.nome); //imprime nome do titular
		
		System.out.println(contaDaLaryssa.titular); //referencia ID do objeto "titular"
	}
}
