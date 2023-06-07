package encapsulation;

public class Encaps_1 {
	
 private long iAccno;
 private String sAccName;
 private String email;
 
 public void setAccNo(long accno) {
	 iAccno=accno;
	 
 }
 
 public void setAccName(String name) {
	 sAccName=name;
	 
 }
 
 public void setEmail(String emailaddress) {
	 email=emailaddress;
	 
 }
 
 public long getAccNo() {
	 return iAccno;
	 
 }
 
 public String getAccName() {
	 
	 return sAccName;
 }
 
 public String getEamiladdress() {
	 
	 return email;
 }
 
	

}
