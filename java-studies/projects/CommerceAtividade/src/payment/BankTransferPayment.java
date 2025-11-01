package payment;

public class BankTransferPayment implements PaymentStrategy {

	@Override
	public void processPayment() {
		System.out.println("\n✅ Processamento de Transferência Bancaria feito!");
	}

	@Override
	public boolean pay(Integer paymentAmount) {
		if (paymentAmount == null) return false;
		
		System.out.println("Pagamento de " + paymentAmount + " feito usando Transferência Bancária.");
		return true;
	}
}
