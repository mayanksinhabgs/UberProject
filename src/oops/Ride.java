package oops;

public class Ride {
		String pickupLocation;
	String dropLocation;
	double distanceInkm;

	public Ride (String pickupLocation, String dropLocation , double distanceInkm) {
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distanceInkm = distanceInkm;
		
	}
	//method
	public void startRide() {
		System.out.println("Ride Started from " + pickupLocation+ " to " + dropLocation +  distanceInkm );
		
		
	}

}
