package oops;

public class PremiumPricing extends BasePricing {
//	overiding
	public double calculateFare(double distance) {
		return distance * 2.5 +5.0;
		
	}
//	overloding
	public double calculateFare(double distance, double discount) {
		double total = calculateFare(distance);
		return total - discount;
		
	}

}
