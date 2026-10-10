package oops;

public class UserWallet {
	private double balance;
	public UserWallet(double initalBalance)
	{
		this.balance = initalBalance;
	}
//	getter
	public double getBalance() {
		return balance;
		
	}
	public void addMoney(double amount) {
		if(amount>0) {
			balance += amount ;
			System.out.println("Added: "+ amount+".New Balance :" +balance);
		}else {
			System.out.println("invalid amount.");
		}
	}
	public boolean deductMoney(double amount) {
		if (amount>0 && balance>=amount ) {
			balance -= amount;
			return true;
			
		}
		return false;
		
	}

}
