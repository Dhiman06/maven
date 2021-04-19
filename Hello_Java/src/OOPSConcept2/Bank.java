package OOPSConcept2;

public interface Bank {

int min_bal =100;//variables are static/final in nature by default and vars value can't be changed
	
	//Interface have only declaration----no method body will be there
	//no interface can have static method
	//no main method
	//Abstract in nature
	//We can't create object of interface
	public void credit();
	public void debit();
	public void moneyTransfer();
}