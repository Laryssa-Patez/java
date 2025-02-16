package threads;

import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
	private static int contador = 0;

	public static void main(String[] args) throws InterruptedException {
		final ReentrantLock lock = new ReentrantLock();
		
	    Thread thread3 = new Thread(new Runnable() {
	        @Override
	        public void run() {
	            System.out.println("Hello thread 3");
	            for (int i = 0; i < 100; i++) {
	                lock.lock();
	                try {
	                    contador++;
	                } finally {
	                    lock.unlock();
	                } 
	            }
	        } 
	    });
			
//	    public int getCounter() {
//	        return contador;
//	    }
	    
	    // Método para iniciar 
	        thread3.start();
	        thread3.join();
//	        System.out.println(Thread.currentThread().getName()); //Get no metodo da thread
	        System.out.println(thread3.getName()); //Get no nome da thread

	}

}
