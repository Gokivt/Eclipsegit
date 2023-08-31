package exception;

public class Fillay_Block {

	public static void main(String[] args) {
		finallyblock();
		
	}
	
	public static void finallyblock() {
		
		int i=10;
		try {
			System.out.println(i/0);
		}
		catch(ArrayIndexOutOfBoundsException E) {  //Even though this method will fail finally block will be executed
			
			System.out.println("This is Exception!!! "+E);
			
		}
		
		finally{
			System.out.println("Close all DB connection");
		}
	}
}
