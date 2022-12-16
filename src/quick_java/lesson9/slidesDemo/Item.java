package quick_java.lesson9.slidesDemo;

public class Item {
	private String name;
	private double price;
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Item(String iname) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return name +  ", " + price ;
	}
	

}
