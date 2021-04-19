package JavaPractice;

import java.util.Scanner;

public class StringReverseConcept {

	public static void main(String[] args) {
		
		String s1="";
		String s2="";
		String rev="";
		int lnth = 0;
		lnth = s1.length();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide the string value");
		s1= sc.nextLine();
		
		//1.using Character Array		
//		char [] chars = s1.toCharArray();
//		lnth = chars.length;
//		for(int i=lnth-1;i>=0;i--) {
//			rev=rev+chars[i];
//		}
//		System.out.println(rev);
//		if (s1.equals(rev)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not Palindrome");
//		}
		
		//2.using charAt method		
//		for(int i=lnth-1;i>=0;i--) {
//			rev =rev+s1.charAt(i);
//		}
//		System.out.println(rev);
//		if(s1.equals(rev)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("not Palindrome");
//		}
		
		//3.Using StringBuffer
//		StringBuffer sb = new StringBuffer(s1);
//		StringBuffer sb1 = sb.reverse();
//		s2=sb1.toString();
//		System.out.println(s2);
//		if(s1.equals(s2)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
		
		//4.Using StringBuilder
		StringBuilder st = new StringBuilder(s1);
		StringBuilder st1 = st.reverse();
		s2=st1.toString();
		if(s1.equals(st1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
