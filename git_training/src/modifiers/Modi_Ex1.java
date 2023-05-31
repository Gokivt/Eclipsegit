package modifiers;

public class Modi_Ex1 {
	//same package non sub class
	
	public static void main(String[] args) {
		Modifiers obj=new Modifiers(); // private method will not be returned Object has been created for Modifiers to get the variables in Modifiers class
		System.out.println(obj.iDefault);
		System.out.println(obj.sProtected);
		System.out.println(obj.sPublic);
	}

}
