package main;

import factory.ProductFactory;
import factory.Product;
import payment.BankTransferPayment;
import payment.CreditCardPayment;
import payment.PayPalPayment;
import payment.PaymentStrategy;
import java.util.Scanner;

public class ECommerceSystem {
	

	public void processOrder(PaymentStrategy strategy) {
		strategy.processPayment();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PaymentStrategy strategy = null;
		
		Product NovoLivro = ProductFactory.CreateProduct("Electronics");
		System.out.println(NovoLivro);
		
		System.out.println("\n-------------------------------------------");
        System.out.println("💳 Qual é o método de pagamento?");
        System.out.println("-------------------------------------------");
        System.out.println("1. Transferência Bancária");
        System.out.println("2. PayPal");
        System.out.println("3. Cartão de Crédito");
        System.out.print("Escolha uma opção (1, 2 ou 3): ");
		int opc = scan.nextInt();
		
		do {
			if (opc == 1) {
				strategy = new BankTransferPayment();
				System.out.println("\n✅ Método de pagamento: Transferência Bancária");
			} else if (opc == 2) {
				strategy = new PayPalPayment();
				System.out.println("\n✅ Método de pagamento: PayPal");
			} else if (opc == 3) {
				strategy = new CreditCardPayment();
				System.out.println("\n✅ Método de pagamento: Cartão de Crédito");
			} else {
				System.out.println("\n❌ Opção INVÁLIDA! Por favor, escolha 1, 2 ou 3.");
			}
		} while(strategy == null);
		
		System.out.println("\nEfetuando pagamento...");
		strategy.processPayment();
		strategy.pay(1000);
	}

}
