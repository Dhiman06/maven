package OOPSConcept2;

public class B extends A {
	
	public B() {//super keyword is used to call parent class constructor
		super();
	}
	public B(int i) {
		super(i);
	}
	public B(int i,int j) {
		super(i,j);
	}

	public static void main(String[] args) {
		B obj1 = new B();
		B obj2 = new B(10);
		B obj3 = new B(10,20);

	}

}
