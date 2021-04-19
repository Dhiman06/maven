package OOP3;

public class ThrowsException {

	public static void main(String[] args) {
		ThrowsException obj = new ThrowsException();
		obj.sum();
		System.out.println("Throws Exception");
	}

	public void sum() {
		
		try {
			div();
		}
		//object class is super call of Throwable calls
		//Throwable class is super class of Error class and Exception class
		catch(Throwable e) {
			
		}
		//System.out.println("Throws Exception");
	}

	public void div() throws ArithmeticException {
		int i = 9/0;
	}

}
