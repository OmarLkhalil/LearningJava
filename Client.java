package Interfaces;

public class Client {
	
	private PaymentProcessor paymentProcessor;
	
	{
		paymentProcessor = new PayPalPaymentProcessor();
	}
	
	public void checkout(PaymentData payment) {
		
		paymentProcessor.processPayment(payment);
		PaymentProcessor.someStaticMethod(); 
	}
	
	public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}
}