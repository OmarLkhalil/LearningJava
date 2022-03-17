package Inheritances;

public class Phone extends Product {
	
	
	public Phone() {
		super("Samsung");
		System.out.println("Ez");
	}
	
	public void ring() {
		System.out.println("Ring!");
	}
	
	@Override 
	public Product[] listVariants() {
		throw new UnsupportedOperationException();
	}
	
	public int calculateAmountOfVariants() {
		return super.listVariants().length;
	}
	
}
