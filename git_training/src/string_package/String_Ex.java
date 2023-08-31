package string_package;

public class String_Ex {
	
	public static void main(String[] args) {
		String s1="Raja";
		String s2="raja";
		String s3="Rahim";
		String s4="Ramesh";
		s1="Rajesh"; 
		StringBuffer s5=new StringBuffer("Gopalakrishnan");
		s5.append("V T");
		System.out.println("String buffer method "+s5);
		
		StringBuilder s6=new StringBuilder("Gopalakrishnan");
		s6.append("V T");
		System.out.println("StringBuilder "+s6);
		
		System.out.println("Equals method "+s1.equals(s2));
		System.out.println("Equals ignore case method "+s1.equalsIgnoreCase(s2));
		System.out.println("Equals method"+s1==s2);
		System.out.println("Concat method "+s1.concat("rakesh"));
		s1=s1.concat(" raju");
		System.out.println("s1 value is "+s1);	
		System.out.println("Strats with method :"+s1.startsWith("R"));
		System.out.println("Strats with method having with characters mentioned :"+s1.startsWith("R"));
		System.out.println(s4.substring(0, 1));
		String sCourse="This is Java training";
		String replace = sCourse.replace("Java", "Selenium");
		System.out.println(replace);
		String sPrice="Iphone price is 300$";
		String replaceAll = sPrice.replaceAll("[a-zA-Z$]", "").trim();
		System.out.println(replaceAll);
		String replaceAll2 = sPrice.replaceAll("[^0-9]", "").trim();
		System.out.println(replaceAll2);
		int parseInt = Integer.parseInt(replaceAll2);
		System.out.println(parseInt);
		if(parseInt==300) {
			System.out.println("Test Validation Passed");
			
		}
	
		String iDate="07/23/2023";
		String[] split = iDate.split("/");
		System.out.println(split[0]);
		String iStr="Mathan";
		String[] split2 = iStr.split("");
		
		for(String s:split2) {
			System.out.println(s);
		}
	
		
	}

}
