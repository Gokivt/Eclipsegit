package thread_package;

public class RunnableThreadP2 implements Runnable {
	
public void run() {
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Tread");
			
		}
		
	}

public static void main(String[] args) {
	RunnableThreadP2 obj1=new RunnableThreadP2();
	Thread t1=new Thread(obj1);
	t1.start();
	for(int i=0;i<5;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Tread");
		
	}
}


}
