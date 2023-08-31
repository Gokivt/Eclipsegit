package interfacee;

public interface Sample {
	
	int iRollNo=100;  //In interface when we are declaring the global variable it will automatically take it is static and final, here 
						// iRoll number is declared with static and final so seeing with italics
	
	public double Homeloanpercentage();
	public double Carloanpercentage();
	public double Personalloanpercentage();
	public double Industryloanpercentage();
	public double Workloanpercentage();
    public abstract double Domesticloanpercentage(); // 100% abstraction method is called interface. So method should not have definition 
    default void defaultmethod() {
    	System.out.println("This is default method in interface"); //Interface allows default method with definition
    																// Override is option in class, during override we need to remove the default keyword in class
    }
    
    public void dummy();

}
