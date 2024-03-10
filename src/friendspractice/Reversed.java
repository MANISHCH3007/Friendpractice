package friendspractice;

public class Reversed {

	public static void main(String[] args) {
		String forwardstr = "Telangana";
		String Reversedstr = "";  // i= index//i++
		for (int i=0;i<forwardstr.length();i++) {
			Reversedstr= forwardstr.charAt(i)+Reversedstr;
		System.out.println(Reversedstr);
		
		
		}
		
		
	}

}
