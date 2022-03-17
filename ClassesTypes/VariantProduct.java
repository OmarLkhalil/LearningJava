package classsestypes;

public class VariantProduct extends Productt {
	
	private MasterProduct[] variants;
	
	@Override 
	public boolean isAvailableInStock() {
		for(MasterProduct masterProduct : variants) {
			if(masterProduct.isAvailableInStock())
			{
				return true;
			}
		}
		return false;
	}
}
