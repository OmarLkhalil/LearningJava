package Inheritances;

public class Demo {

	public static void main(String[] args) {
		Product product = new Phone();
		product.setName("Samsung A21S");
		System.out.println("Product name: " + product.getName());
		System.out.println("Remaining amount in stock " + product.calculateRemainingAmount());
		
		
		Phone phone2 = new Phone();
		phone2.ring();
		
		if (product instanceof Phone)
		{
			Phone phone3 = (Phone) product;
			phone3.ring();
			
		}
		System.out.println(phone2.calculateAmountOfVariants());
	}

}
