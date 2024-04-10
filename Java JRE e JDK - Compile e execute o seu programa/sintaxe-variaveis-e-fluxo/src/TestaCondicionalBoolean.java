
public class TestaCondicionalBoolean {

	public static void main(String[] args) {
		int idade = 21;
		boolean acompanhado = true;
		
		System.out.println("Mostra valor da variável acompanhado: " + acompanhado);
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem-vinda!");
		}
		else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}
