package constructor;

public class ConstructorMethod {
	
	String sName="Rahul";
	int iRollNo=1020;
	
	public ConstructorMethod() {
		System.out.println("This is default constructor!!!");
		
	}
	
	public ConstructorMethod(String S, int r) {
		
		sName=S;
		iRollNo=r;
		
	}
	
	public void print() {
		System.out.println("Name is: "+sName);
		System.out.println("Roll No is: "+iRollNo);
		
	}

	public static void main(String[] args) {
		ConstructorMethod obj= new ConstructorMethod();
		obj.print();
		ConstructorMethod obj1= new ConstructorMethod("Vijay",2020);
		obj1.print();
		

	}

}
