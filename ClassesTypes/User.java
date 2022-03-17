package classsestypes;

import java.util.Arrays;

public class User {
	
	public static final int DISCOUNT_THRESHOLD_USD = 1000;
	public static final double FIVE_PERCENT_DISCOUNT = 0.05;
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private Product[] products;
	
	public double calculateDiscount() {
		double totalPriceAllProductBought = Arrays.stream(products)
				.map(product -> product.getPrice())
				.mapToDouble(price -> price.doubleValue())
				.sum();
		
		if (totalPriceAllProductBought >= DISCOUNT_THRESHOLD_USD) {
			return FIVE_PERCENT_DISCOUNT;
		}
		else {
			return 0 ;
		}
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id)
	{
	 this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Product[] getProducts() {
		return products;
	}
	
	public void setProducts(Product[] products) {
		this.products  = products;
	}
}
