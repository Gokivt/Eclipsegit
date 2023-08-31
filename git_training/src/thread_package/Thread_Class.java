package thread_package;

public class Thread_Class extends Thread {
	
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
		Thread_Class obj=new Thread_Class(); 
		obj.start();
		
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
