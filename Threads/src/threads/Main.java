package threads;

public class Main {

	public static void main(String[] args) {
		System.out.println("Estudo sobre programação paralela com threads");
		
		Thread thread1 = new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("Hello thread");
				throw new RuntimeException("Exceção da thread");
			}
		});
		
		Thread thread2 = new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("Hello thread 2");
			}
		});
		
//		thread.setPriority(Thread.MAX_PRIORITY);
		thread1.start(); //Inicia a thread
		
		//Capturando exceções lançadas que não possuem tratamento
		thread1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("critical error occurred");
			}
		});

		thread2.start(); //Inicia a thread2
	}
	
}
