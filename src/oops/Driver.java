package oops;

	public class Driver extends User{
		private String licenseNumber;
		private String vehicalModel;
		
		public Driver (String name, String phone, String licenseNumber, String vechicalmodel) {
			super(name,phone);
			this.licenseNumber = licenseNumber;
			this.vehicalModel = vehicalModel;
			
			
		}
		public void acceptRide() {
			System.out.println(name+" accepted the ride in a" +vehicalModel);
			
		}
	}



