package amazon;

public class AmazonLoginPage {

	public AmazonHomePage loginfunction(String Username, String Password) {
		System.out.println("User name and Password entered successful");

		return new AmazonHomePage();
	}
	public static void main(String[] args) {
		new AmazonLoginPage()
		.loginfunction("Amazonusername", "Password")
		.selectprocut("Mobile")
		.productcheckout("Samsung")
		.PaymentSuccessful();
	}
}
