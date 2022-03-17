package classsestypes;

public abstract class Productt {
	
	private int id;
	private String name;
	private int minOrderQuantity;
	private boolean isDeliveryAvailable;
	
	public abstract boolean isAvailableInStock();
	
	public int getRemainingAmountInStock() {
		return 100;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMinOrderQuantity() {
		return minOrderQuantity;
	}
	public void setMinOrderQuantity(int minOrderQuantity) {
		this.minOrderQuantity = minOrderQuantity;
	}
	
	public boolean isDeliverAvailable() {
		return isDeliveryAvailable;
	}
	
	public void setDeliverAvailable(boolean isDeliveryAvailable) {
		this.isDeliveryAvailable = isDeliveryAvailable;
	}
}
