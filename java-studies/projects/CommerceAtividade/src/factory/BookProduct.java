package factory;

public class BookProduct implements Product {
	String name;
	double price;
	String description;
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public String getDescription() {
		return this.description;
	}
}
