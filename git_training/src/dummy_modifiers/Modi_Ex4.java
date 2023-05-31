package dummy_modifiers;
import modifiers.*;

public class Modi_Ex4 extends Modifiers{
	
	//Different package sub class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Modifiers obj=new Modifiers();
		
		System.out.println(obj.sPublic);
		
		Modi_Ex4 obj1=new Modi_Ex4();
		System.out.println(obj1.sProtected);
		System.out.println(obj1.sPublic);

	}

}
