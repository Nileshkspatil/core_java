package stream;

public class Laptop {
	
	String brand;
	String model;
	double price;

	public Laptop(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
	
	

}
