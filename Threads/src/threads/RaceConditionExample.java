package threads;

public class RaceConditionExample {
	
    private static Integer contador = 0;
	
	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("Hello thread");
				for (int i = 0; i < 100; i++) {
					contador++;
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("Hello thread 2");
				for (int i = 0; i < 100; i++) {
					contador++;
				}
			}
		});
		
		thread1.start(); //Inicia a thread 1
		thread2.start(); //Inicia a thread 2
	
		// a thread que está executando esse código (método main) ficará pausada até que thread1 termine sua execução.
		thread1.join();
		
		// Após thread1 terminar e a execução continuar, a thread principal irá aguardar que thread2 também termine sua execução.
		thread2.join();
		
		System.out.println(contador);
    
	}
}
