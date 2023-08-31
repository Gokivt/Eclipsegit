package interfacee;

public class Classextends implements Sample, MultiSample { //Multiple inheritance is possible in interface

	@Override
	public double Homeloanpercentage() {
		// TODO Auto-generated method stub
		return 7.8;
	}

	@Override
	public double Carloanpercentage() {
		// TODO Auto-generated method stub
		return 11;
	}

	@Override
	public double Personalloanpercentage() {
		// TODO Auto-generated method stub
		return 8.9;
	}

	@Override
	public double Industryloanpercentage() {
		// TODO Auto-generated method stub
		return 9.5;
	}

	@Override
	public double Workloanpercentage() {
		// TODO Auto-generated method stub
		return 6.3;
	}

	@Override
	public double Domesticloanpercentage() {
		// TODO Auto-generated method stub
		return 10;
	}
	
	public void defaultmethod() {
    	System.out.println("This is Override method in class!!!"); //Interface allows default method with definition
    																// Override is option in class, during override we need to remove the default keyword in class
    }
	
	public static void main (String[] args) {
		Classextends obj=new Classextends();
		Sample obj1=new Classextends();
		System.out.println(obj.Carloanpercentage());
		System.out.println(obj.Domesticloanpercentage());
		System.out.println(obj.Homeloanpercentage());
		System.out.println(obj.Industryloanpercentage());
		System.out.println(obj.Personalloanpercentage());
		System.out.println(obj.Workloanpercentage());
		obj.defaultmethod();
		
		System.out.println(obj1.Carloanpercentage());
		System.out.println(obj1.Domesticloanpercentage());
		System.out.println(obj1.Homeloanpercentage());
		System.out.println(obj1.Industryloanpercentage());
		System.out.println(obj1.Personalloanpercentage());
		System.out.println(obj1.Workloanpercentage());
		obj1.defaultmethod();
		
	}

	
	public void dummy() {
		System.out.println("This is muthiple inheritance!!!");
		
	}

	
}
