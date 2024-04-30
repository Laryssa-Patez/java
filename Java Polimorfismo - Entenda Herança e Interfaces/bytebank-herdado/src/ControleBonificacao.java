
public class ControleBonificacao {
	
	private double soma;

	public void registra(Funcionario f) {
		double boni = f.getbonificacao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
