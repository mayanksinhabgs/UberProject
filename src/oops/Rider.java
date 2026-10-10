package oops;

public class Rider extends User {
	
		private UserWallet wallet;
		
		public Rider(String name, String phone, double initalBalance) {
			super(name,phone);
			this.wallet = new UserWallet(initalBalance);
			
			
		}
		public UserWallet getWallet() {
			return wallet;
			
		}
	}

