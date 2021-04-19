package OOPSConcept2;

public class ConstructorConcept {

	String name;
	int age;

	public ConstructorConcept() {
		System.out.println("Cons--1");
	}

	public ConstructorConcept(int i) {
		System.out.println("Cons--2");
		System.out.println(i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("Cons--3");
		System.out.println(i + " " + j);
	}

	public ConstructorConcept(String name, int age) {
		System.out.println("Cons--4");
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// constructor is called once the object is created for that constructor
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10, 20);
		ConstructorConcept obj3 = new ConstructorConcept("TOM", 25);
		System.out.println(obj3.name);
		System.out.println(obj3.age);
	}

}
