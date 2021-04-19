package OOPSConcept2;

public class CarModel {

	String name;
	int price;
	String modelNumber;
	String engine;

	public CarModel(String name, int price, String modelNumber, String engine) {
		this.name = name;
		this.price = price;
		this.modelNumber = modelNumber;
		this.engine = engine;

	}

	public static void main(String[] args) {
		CarModel obj1 = new CarModel("BMW", 15, "32d", "Automatic");
		CarModel obj2 = new CarModel("Audi", 10, "A8", "Automatic");
		CarModel obj3 = new CarModel("Honda", 7, "City", "Manula");

		System.out.println(obj1.name + " " + obj1.price + " " + obj1.modelNumber + " " + obj1.engine);
		System.out.println(obj2.name + " " + obj2.price + " " + obj2.modelNumber + " " + obj2.engine);
		System.out.println(obj3.name + " " + obj3.price + " " + obj3.modelNumber + " " + obj3.engine);
	}

}
