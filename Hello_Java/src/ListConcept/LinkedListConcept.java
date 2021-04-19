package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Dhiman");
		ll.add("Dina");
		ll.add("Coco");

		System.out.println(ll);

		System.out.println("*************");

		ll.addFirst("Mr");
		ll.addLast("Roy");

		System.out.println(ll);

		System.out.println("*************");

		ll.set(1, "Dhimz");
		System.out.println(ll);
		System.out.println("*****Using for loop********");

		// loop
		// 1.for loop
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("*****Using advance for loop********");
		
		for(String str : ll) {
			System.out.println(str);
		}
		System.out.println("*****Using Iterator********");
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*****Using while loop********");
		
		int num = 0;
		while(num<ll.size()) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
