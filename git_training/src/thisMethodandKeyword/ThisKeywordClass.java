package thisMethodandKeyword;

public class ThisKeywordClass {
	
	String sName;
	int iRollNo;
	
	 public ThisKeywordClass(String sName, int iRollNo) {
		 this.sName=sName;
		 this.iRollNo=iRollNo;
		 
	 }
	 
	 public void print() {
		 System.out.println("RollNo is :"+iRollNo);
		 System.out.println("Name is :"+sName);
		 }
	 
	 public void callprint() {
		 
		 this.print(); //--> print();
		
		 System.out.println("This keyword memory"+this); //-->Both this and obj memory will be same
		 callbyobject(this); // This keyword can be passed in non-static method
		 
	 }
	 
	 public void callbyobject(ThisKeywordClass object) {
		
		 print(); //-->this.print();
		 }
	 
	 public ThisKeywordClass returntosameclass() {
		 return this; //--> new ThisKeyWordClass("Rahul", 1020);
	 }
	 
	 public static void main(String[] args) {
		ThisKeywordClass obj=new ThisKeywordClass("Rahul", 1020);
		obj.callprint();
		System.out.println("Object reference memory"+ obj);
		obj.callbyobject(obj); // we cannot pass this keyword inside the static method as argument
		obj.returntosameclass().callbyobject(obj);
		
	}

}
