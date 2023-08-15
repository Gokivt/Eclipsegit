package encapsulation;

public class Encaps_2 extends Encaps_1 {

	public static void main(String[] args) {

		Encaps_2 obj= new Encaps_2();
		obj.setAccName("Raja");
		obj.setAccNo(12345);
		obj.setEmail("Eamil@email.com");
		
		
		System.out.println("Account Number is: "+obj.getAccNo());
		System.out.println("Account Name is: "+obj.getAccName());
		System.out.println("Email address is: "+obj.getEamiladdress());
		

	}

}
