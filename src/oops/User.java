package oops;

public class User {
	protected String name;
	protected String phone;
	
	public User(String name, String phone) {
		this.name = name;
		this.phone = phone;
		
	}
	public void displayProfile() {
		System.out.println("Name : "+name+" |Phone :" +phone);
	
	}

}
//public class Rider extends User{
//	private UserWallet wallet;
//	
//	public Rider(String name, String phone, double initalBalance) {
//		super(name,phone);
//		this.wallet = new UserWallet(initalBalance);
//		
//		
//	}
//	public UserWallet getWallet() {
//		return wallet;
//		
//	}
//}
//public class Driver extends User{
//	private String licenseNumber;
//	private String vehicalModel;
//	
//	public Driver (String name, String phone, String licenseNumber, String vechicalmodel) {
//		super(name,phone);
//		this.licenseNumber = licenseNumber;
//		this.vehicalModel = vehicalModel;
//		
//		
//	}
//	public void acceptRide() {
//		System.out.println(name+" accepted the ride in a" +vehicalModel);
//		
//	}
//}
