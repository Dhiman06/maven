package OOP3;

public class ThrowKeyword {

	public static void main(String[] args) {
		// throw keyword is used to create an exception deliberately
		System.out.println("throw keyword");
		try {
			throw new Exception("Dhimz exception");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exception handled");
	}

}
