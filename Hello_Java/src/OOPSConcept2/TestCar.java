package OOPSConcept2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism---compile time polymorphism
		BMW b=new BMW();
		b.start();
		b.safety();
		b.wheel();
		b.stop();
		b.engine();
		System.out.println("******************");
		//dynamic polymorphism---run time polymorphism
		//child class object can be referred by parent class reference variable
		//Top casting
		Car c1= new BMW();
		c1.start();
		c1.stop();
		c1.engine();
		
		//Down casting
		BMW b1=(BMW)new Car();//ClassCastException will through

	}

}


	
	