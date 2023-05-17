package thisMethodandKeyword;

public class ThisMethod {
	String sName;
	int iRollNo;
	
 public ThisMethod() {
	 this(100);
	 System.out.println("This is default constructor!!!");
 }
	
	 public ThisMethod(String sName, int iRollNo) {
		 this(); //This method is used to invoke the default constructor or constructor call
		 this.sName=sName;
		 this.iRollNo=iRollNo;
		 
	 }
	 
	 public void print() {
		 System.out.println("Name is :"+sName+"Roll no is :"+iRollNo);
	 }
	 
	 public ThisMethod(int i) {
		
		 System.out.println("I value is :"+i);
	 }

	public static void main(String[] args) {
//		ThisMethod obj=new ThisMethod();
//		obj.print();
		
		ThisMethod obj1=new ThisMethod("Rahul", 2020);
		obj1.print();
		

	}

}
