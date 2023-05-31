package methodoverriding;

public class RBI {
	
	int iRBI=1234;
	String sRBIBranch="Thenampet";
	
	public RBI(int i) {
		System.out.println("This is default RBI constructor!!!");
	}

	public void dummy() {
		System.out.println("This is dummy method in RBI");
	}

	public void print() {
		System.out.println("Branch code is"+ iRBI);
		System.out.println("Branch name is "+sRBIBranch);
		
	}

}
