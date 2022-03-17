package classsestypes;
import classsestypes.Cart;
import classsestypes.Cart.Discount;
import classsestypes.Cart.Tax;

public class Demo{
	
	public static void main(String args[]) 
	{
		User user = new User();
		
		Tax tax = new Cart.Tax("tax type", 0);
		
		
		Discount discount = new Cart().new Discount("FirstClientDiscount", 0);
		
		
		MasterProduct masterProduct = new MasterProduct();
		VariantProduct variantProduct = new VariantProduct();
		
		masterProduct.setName("Marcedes");
		variantProduct.setDeliverAvailable(true);
		
		Productt product = new Productt() {
		
		@Override
		public boolean isAvailableInStock() {
			return false;
		}
		};
	}
}