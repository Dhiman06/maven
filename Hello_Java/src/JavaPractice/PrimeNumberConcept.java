package JavaPractice;

import java.util.Scanner;

public class PrimeNumberConcept {

	public static void main(String[] args) {
		
		int num=0;
		boolean isPrime = true;
		Scanner sc = new Scanner (System.in);
		System.out.println("Please provide the number");
		num = sc.nextInt();
		for(int i =2;i<num;i++) {
			if(num%i==0) {
				isPrime = false;				
				break;
			}
		}
	
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is not a prime number");
		}

	}

}
