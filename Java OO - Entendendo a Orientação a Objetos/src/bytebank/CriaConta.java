package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 1500.0;
		
		System.out.println("Primeira conta");
		System.out.println("Saldo:" + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 500;
		
		System.out.println();
		System.out.println("Segunda conta");
		System.out.println("Saldo:" + segundaConta.saldo);
		
		//Verifica se são a mesma conta
		if(primeiraConta == segundaConta) { //Compara a referência de cada variável 
			System.out.println("É a mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
	}
}
	
