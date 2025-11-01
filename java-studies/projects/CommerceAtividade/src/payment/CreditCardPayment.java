package payment;

public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void processPayment() {
		System.out.println("\n✅ Processamento de Cartão de Crédito feito!");
	}

	@Override
	public boolean pay(Integer paymentAmount) {
		if (paymentAmount == null) return false;
		
		System.out.println("Pagamento de " + paymentAmount + " feito usando Cartão de Crédito.");
		return true;
	}
}
