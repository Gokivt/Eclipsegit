package inheritancepackage;

public class HDFC extends RBI {
	
	int iHDFC=2123;
	String sHDFCBranch="Adayar";
	
	public HDFC() {
		//super(); --> By default this method will be invoked until the created constructor is not having parameter when it finds the keyword extends. 
		//This is used to call the constructor from the immediate parent class
		super(100); //--> Super method needs to call explicitly when the immediate parent class created constructor created with parameter
		System.out.println("This is default HDFC constructor!!!");
	}

	public void display() {
		super.print(); //-->super keyword used to call the method from parent class

		System.out.println("Branch code is"+ iHDFC);
		System.out.println("Branch name is "+sHDFCBranch);
		
		
		
	}
	public static void main(String[] args) {
		
		HDFC oHDFC=new HDFC();
		oHDFC.display();
		

	}

}
