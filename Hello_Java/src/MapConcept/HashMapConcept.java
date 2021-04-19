package MapConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import ListConcept.Student;

public class HashMapConcept {
	
	public static Map<String, Integer> marks;
	
	static {
		marks = new HashMap<>();
		marks.put("Math", 100);
		marks.put("English", 70);		
	}

	public static void main(String[] args) {
		// is a class extends abstract map class and implements Map Interface
		// it contains only unique elements
		// stores values in the form of key - value pair
		// it may have one null key and multiple null values
		// maintains no order
		//non-synchronized
		//dis-advantage - fail fast condition--concurrent modification exception 
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Dhiman");
		hm.put(2, "Coco");
		hm.put(3, "Dina");

		System.out.println(hm.get(2));
		System.out.println("**********************");
		// to get only value
		for (int i = 1; i <= hm.size(); i++) {
			System.out.println(hm.get(i));
		}
		System.out.println("**********************");
		// to get both key and value
		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("**********************");
		
		HashMap<Integer,Student> st = new HashMap<Integer,Student>();
		
		Student s1 = new Student("Dhiman", 25, "IT", "4th");
		Student s2 = new Student("Coco", 23, "ECE", "2nd");
		Student s3 = new Student("Dina", 24, "CSE", "3rd");
		
		st.put(1, s1);
		st.put(2, s2);
		st.put(3, s3);
		
		//Traverse the HashMap
		
		for(Entry<Integer,Student> m1 : st.entrySet()) {
			int key = m1.getKey();
			Student sd = m1.getValue();
			System.out.println(key+" "+"Details");
			System.out.println(sd.name+" "+sd.age+" "+sd.dept+" "+sd.year);
		}
		
		//Different ways of creating HashMap
		//1. using HashMap class
		HashMap<String,String> hm1 = new HashMap<>();
		Map<String, String> hm2 = new HashMap<>();
		
		//2.Static way : static HashMap---see line 11 to 17
		
		System.out.println(HashMapConcept.marks.get("Math"));
		System.out.println("**********************");
		//3.Immutable map with only one single entry---will get UnsupportedOperationException when adding mulitple entry in Map
		Map<String, Integer> hm3 = Collections.singletonMap("Dhimz",500);
		System.out.println(hm3.get("Dhimz"));
		//Another way to create singletoin map
//		Map<String, Integer> hm4 = Map.of();//for JDK 1.9
//		hm4.put("Coco",3);
//		System.out.println(hm4.get("Coco"));
//		//hm3.put("Coco",600);
//		//System.out.println(hm3.get("Coco"));
//		System.out.println("**********************");
//		//4.
		

	}
	

}
