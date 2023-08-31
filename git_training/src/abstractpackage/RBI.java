package abstractpackage;

public abstract class RBI {

	static final String  Branch="Parrys";
	//Branch="Kilpauk";
	
	
	public RBI() { 
		System.out.println("This is RBI default constructor !!!");
	}
	
	public double Homeloanpercentage() {

		return 6.8;
	}
	public double Carloanpercentage() {
		
		
		return 7.5;
	}
	public double Personalloanpercentage() {
		
		
		return 9.0;
	}
	public abstract double Industryloanpercentage();
	
	public abstract double Workloanpercentage();
	
	public abstract double Domesticloanpercentage();
	
}

