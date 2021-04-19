package OOPSConcept2;

public class TestInterface {

	public static void main(String[] args) {
		
		//If a class is implementing any interface, then its mandatory to override/define all methods of interface 
		
		HDFCBank obj = new HDFCBank();
		obj.credit();
		obj.debit();
		obj.moneyTransfer();
		obj.loan();
		obj.mortgage();
		
		System.out.println("**************");
		
		Bank b1= new HDFCBank();
		b1.credit();
		b1.debit();
		b1.moneyTransfer();
		int t =Bank.min_bal;
		System.out.println(t);
		
		System.out.println("**************");
		
		obj.note();
		
	}

}
