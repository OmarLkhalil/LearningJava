package classsestypes;

public class MasterProduct extends Productt {
	
	private boolean isAvailableForLease;
	
	
	@Override
	public boolean isAvailableInStock() {
		return getRemainingAmountInStock() > 0 ;
	}
}
