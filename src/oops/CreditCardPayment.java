package oops;

public class CreditCardPayment implements  PaymentProcessor {
	private String cardNumber;
	
	public CreditCardPayment(String cardNumber) {
		this.cardNumber = cardNumber;
		
	}
	public void processPayment(double amount) {
		System.out.println("Processing Credit Card Payement of $" + amount + "on card ending in" + cardNumber.substring(cardNumber.length() - 4));
	}

}
