package abstractpackage;

public class HDFCBranch extends HDFCMain {
	static String Branchname="Kilpauk";

	public static void main(String[] args) {
		HDFCMain obj=new HDFCBranch();
		System.out.println(obj.Carloanpercentage());
		System.out.println(obj.Domesticloanpercentage());
		System.out.println(obj.Homeloanpercentage());
		System.out.println(obj.Industryloanpercentage());
		System.out.println(obj.Personalloanpercentage());
		System.out.println(obj.Workloanpercentage());
		System.out.println(obj.Branch);
		System.out.println("Branch name is: "+Branchname);
	   
	    
		
		

	}

	@Override
	public double Domesticloanpercentage() {
		// TODO Auto-generated method stub
		return 10.1;
	} 

}
