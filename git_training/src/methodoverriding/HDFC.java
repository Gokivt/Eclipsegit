package methodoverriding;

public class HDFC extends RBI {
	
	int iHDFC=2123;
	String sHDFCBranch="Adayar";
	
	public HDFC() {
		super(100); //--> Super method needs to call explicitly when the immediate parent class created constructor created with parameter
		System.out.println("This is default HDFC constructor!!!");
	}

	public void display() {
		
		System.out.println("Branch code is"+ iHDFC);
		System.out.println("Branch name is "+sHDFCBranch);

	}
	
	public void print() {
		System.out.println("This is overriding method!!!");
	
	}
	
	
	public static void main(String[] args) {
		
		HDFC oHDFC=new HDFC();
		oHDFC.display();
		oHDFC.print();   //Compile time polymorphism. During compile time itself it will call the print() from child class. Static binding
		
		RBI oRef=new HDFC();  //creating reference for parent and object for child
		oRef.print();
		oRef.dummy();     //Runtime polymorphism. During runtime it will call the print() from child class. Dynamic binding
	
		

	}

}
