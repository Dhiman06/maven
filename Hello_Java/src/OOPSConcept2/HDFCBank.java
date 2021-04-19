package OOPSConcept2;

public class HDFCBank implements Bank,RBIBank {
	//Is-a relationship
	public void credit() {
		System.out.println("only Credit");
	}
	public void debit() {
		System.out.println("no debit");
	}
	public void moneyTransfer() {
		System.out.println("Transfer in my account only");
	}
	
	public void loan() {
		System.out.println("no loan please");
	}
	
	public void mortgage() {
		System.out.println("not required");
	}
	public void note() {
		System.out.println("RBI Rule");
	}
	
}
