package payment;

public interface PaymentStrategy {
	boolean pay(Integer paymentAmount);
	public void processPayment();
}
