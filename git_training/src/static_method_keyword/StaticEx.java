package static_method_keyword;

public class StaticEx {

	
	String sName;
	int iRollno;
	static String iBatch="Java Selenium";
	static int page=0; // for static variable on calling each time the memory allocation will not be changed
	
	public StaticEx(String name, int rollno) {
		
		sName=name;
		iRollno=rollno;
		page++; 
		
	}
	
	public void printdetails() {
		System.out.println("Name is :"+sName);
		System.out.println("Roll no is :"+iRollno);
		System.out.println("Roll no is :"+page);
	
		
	}
	
	public static void staticMethod() {
		System.out.println("Batch is :"+iBatch);  //non static global variable cannot be called in static method
		
		System.out.println("This is user defined static method!!!");
	}
	
	public static void main(String[] args) {
		
		StaticEx obj=new StaticEx("Rahul", 1020); //Object needs to be created to call the non static method
		obj.printdetails();
		StaticEx obj1=new StaticEx("Rakesh", 1021); //Object needs to be created to call the non static method
		obj1.printdetails();
		StaticEx obj2=new StaticEx("Shilpa", 1023); //Object needs to be created to call the non static method
		obj2.printdetails();
		StaticEx obj3=new StaticEx("Raja", 1024); //Object needs to be created to call the non static method
		obj3.printdetails();
		
		staticMethod(); // Static method can be called in another static method (main method) without creating object
		
		//StaticEx.staticMethod(); //static method can be called in another static method by using class. Because static methods can be called using class
		
		
		

	}

}
