import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Coco {


	public static void main(String[] args) {
		final int year =12;
		int principle =0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.print("Provide the principle: ");
		principle = scanner.nextInt();
		if (principle >=100 && principle<=10000)
			break;
		System.out.println("Please provide priciple between 100 and 10000");
		}
		System.out.println("Principle is :"+principle);
		/*System.out.print("Please provide tenure: ");
		int tenure = scanner.nextInt();
		System.out.println("Tenure: "+tenure);
		int totalTenure = tenure*year;
		System.out.println("Total month: "+totalTenure);
		System.out.print("Please provide annual interest rate: ");		
		float annualInterestRate = scanner.nextFloat();
		System.out.println("Annual Rate is: "+annualInterestRate);
		float monthlyIntrate = annualInterestRate/100/year;
		System.out.println("Monthly Interest Rate is: "+monthlyIntrate);
		
		double mortgage =principle*(monthlyIntrate*Math.pow(1+monthlyIntrate,totalTenure))
				/Math.pow(1+monthlyIntrate,totalTenure)-1;
				System.out.println("Monthly EMI is: "+mortgage);
		String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("EMI : "+mortgageFormat);*/
		
		
		
		
		
	

	}

}
