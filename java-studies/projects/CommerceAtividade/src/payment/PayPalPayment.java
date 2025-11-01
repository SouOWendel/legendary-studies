package payment;

public class PayPalPayment implements PaymentStrategy {

	@Override
	public void processPayment() {
		System.out.println("\n✅ Processamento de PayPal feito!");
	}

	@Override
	public boolean pay(Integer paymentAmount) {
		if (paymentAmount == null) return false;
		
		System.out.println("Pagamento de " + paymentAmount + " feito usando PayPal.");
		return true;
	}
}
