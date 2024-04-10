
public class ExercicioAliquotaIfs {

	public static void main(String[] args) {
		
		double salario = 1800.0;
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("Porcentagem IR: 7.5%");
			System.out.println("Deve declarar: R$ 142,00");
			
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Porcentagem IR: 15%");
			System.out.println("Deve declarar: R$ 350,00");
				
		} else if (salario >= 3751.1 && salario <= 4664.00) {
			System.out.println("Porcentagem IR: 22.5%");
			System.out.println("Deve declarar: R$ 636,00");
		} else {
			System.out.println("Não é obrigatória a declaração de IR.");
		}
	}
}
