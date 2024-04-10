
public class ExercicioFatorial {
 
	public static void main(String[] args) {
		int fatorial = 1;
		
		System.out.println("Número fatorial: ");
		for(int numero = 1; numero < 11; numero++) {
			//System.out.println(numero);
			fatorial *= numero;
			//System.out.println(fatorial);
			System.out.println(numero + " => " + fatorial);
		}
	}
}

