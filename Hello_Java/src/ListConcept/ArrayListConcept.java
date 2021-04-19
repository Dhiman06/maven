package ListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListConcept {

	// private static int i;

	public static <E> void main(String[] args) {

		int a[] = new int[3];// static array--size is fixed
		// dynamic array - ArrayList
		// can contain duplicate values
		// maintains insertion order
		// not synchronized--not thread safe
		// allow random access to fetch any elements because it stores the values in the basis of indexes

		ArrayList ar = new ArrayList();// non-generic ArrayList object

		ar.add(10);
		ar.add(20);
		ar.add(30);

		System.out.println(ar.size());

		ar.add(30);
		ar.add(40);

		System.out.println(ar.size());// to get the size of ArrayList
		System.out.println(ar.get(1));// To get the value from an index

		// to print all values from ArrayList:
		// 1.for loop
		// 2.Iterator

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// generic vs non-generic :

		ArrayList<Integer> ar1 = new ArrayList<Integer>();// generic ArrayList

		ar1.add(1500);

		// ArrayList<E> ar2 = new ArrayList<E>();//when don't know the data type of
		// ArrayList
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");

//		String var = sc.next();
//		int var1 =sc.nextInt();
//		String var2 = sc.next();
//		String var3 = sc.next();
//		//System.out.println(var);

		Student st = new Student("Dhiman", 25, "IT", "4th");
		Student st1 = new Student("Rohit", 23, "ECE", "2nd");
		Student st2 = new Student("Abhishek", 21, "CSE", "1st");

		ArrayList<Student> star = new ArrayList<Student>();
		star.add(st);
		star.add(st1);
		star.add(st2);

		// iterator to traverse the values
		Iterator<Student> it = star.iterator();

		while (it.hasNext()) {
			Student emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			System.out.println(emp.year);
		}

		System.out.println("*********************");

		ArrayList<String> star1 = new ArrayList<String>();
		ArrayList<String> star2 = new ArrayList<String>();

		star1.add("Roy");
		star1.add("Dutta");
		star1.add("Dey");

		star2.add("Das");
		star2.add("Roy");
		star2.add("Mondal");

		// retainAll
//		star1.retainAll(star2);
//		for (int k = 0; k < star1.size(); k++) {
//			System.out.println(star1.get(k));
//		}
//		System.out.println("*********************");
//		// addAll
//		star1.addAll(star2);
//		for (int i = 0; i < star1.size(); i++) {
//			System.out.println(star1.get(i));
//		}
//
//		System.out.println("*********************");
//
//		// removeAll
//		star1.removeAll(star2);
//		for (int j = 0; j < star1.size(); j++) {
//			System.out.println(star1.get(j));
//		}
//		System.out.println("*********************");
		// CloneList
		ArrayList<String> clnlst = (ArrayList<String>) star1.clone();
		System.out.println(clnlst);
		System.out.println("*********************");
		//Contains
		boolean s = star1.contains("Bhowmik");
		System.out.println(s);
		System.out.println("*********************");
		//indexOf
		System.out.println(star1.indexOf("Dutta"));
		System.out.println("*********************");
		
		ArrayList<String> arlst1 = new ArrayList<String>(Arrays.asList("evening","morning","night"));
		System.out.println(arlst1);
		System.out.println("*********************");
		
		ArrayList<Integer> arlst2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		//arlst2.removeIf(num -> num%2 ==1);
		System.out.println(arlst2);
		
	}

}
