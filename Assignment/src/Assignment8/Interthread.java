package Assignment8;

public class Interthread {

	public static void main(String[] args) throws InterruptedException {
		ThreadA a = new ThreadA();
		a.start();
		synchronized (a) {
			System.out.println("Main thread calling wait() method");
			a.wait();
			System.out.println("Main thread got notification call");
			System.out.println("Sum of number:" + a.sum);
			
		}
		
	}

}


class ThreadA extends Thread{
	
	int sum = 0;
	
	public void run() {
		
		synchronized (this) {
			System.out.println("Child thread starts calculation for sum");
			for(int i=0; i<=10; i++) {
				sum = sum + 1;
			}
			System.out.println("Child thread gives notification call");
			this.notify();
		}
	}
}