package thread_package;

public class JoinThreadP3 extends Thread {
	
public void run() {
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Tread"+"Thread id is :"+Thread.currentThread().getId()+"- Name is :"+Thread.currentThread().getName());
			
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		JoinThreadP3 obj=new JoinThreadP3(); 
		JoinThreadP3 obj1=new JoinThreadP3();
		JoinThreadP3 obj2=new JoinThreadP3();
		
		obj.start();
		obj1.start();
		obj.setName("Object 1");
		obj1.setName("Object 2");
		obj.join(); //First it will run the priority as have added join method 
		obj1.join(); //Once both actions are completed then it will take to the next run
		obj2.start();
		
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
