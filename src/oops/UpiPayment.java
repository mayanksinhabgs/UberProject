package oops;

public class UpiPayment implements PaymentProcessor {
	private String upiId;
	
	public void UpiPayement(String upild) {
		this.upiId = upiId;
		
	}
	public void processPayment(double amount) {
		System.out.println("Processing UPI payment of " + amount + "via " + upiId);
		
	}
	

}
