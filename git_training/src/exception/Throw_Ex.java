package exception;

public class Throw_Ex {
	
	public static void main(String[] args) throws Gopalexeception {
		illegalage(16); 
	}

	public static void illegalage(int age) throws Gopalexeception {
		if(age<18) {
			throw new Gopalexeception("Age is below 18!!!");
		}
		
		else {
			System.out.println("Eligible for voiting!!!");
		}
	}
}
