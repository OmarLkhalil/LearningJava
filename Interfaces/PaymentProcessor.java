package Interfaces;

public interface PaymentProcessor {
	
	int RETRY_ATTEMPTS = 5;
	
	void processPayment(PaymentData payment);
	
	 default void someDefaultMethod() {
		System.out.println("This is the default Method");
	}
	
	static void someStaticMethod() {
		System.out.println("This is the static Method");
	}
}
