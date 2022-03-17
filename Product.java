package Inheritances;

public class Product {
	
	private int id;
	private String name;
	
	public Product(String name) {
		this.name = name;
	}
	
	public int calculateRemainingAmount() {
		return 100;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Product [] listVariants() {
		return new Product[2];
	}
}
