package oopsconceptsoverridinginheritance;

public class TestBank {
public static void main(String[] args) {
	System.out.println(USBANK.min_bal);
	System.out.println(USBANK.max_bal);
	YESBANK yb = new YESBANK();
	yb.credit();
	yb.debit();
	yb.transfermoney();
	yb.educationloan();
	yb.carlaon();
	
	USBANK b =new YESBANK();
	b.credit();
	b.debit();
	b.transfermoney();
	// CHILD CLASS OBJECT CAN BE REFERRED BY PARENT INTERFACE REFERENCE VAR.
}
}
