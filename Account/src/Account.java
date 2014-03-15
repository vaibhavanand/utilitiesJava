
public class Account 
{
	private double Balance;
	public Account(double inBalance)
	{
		Balance = inBalance;
	}
	public void credit(double amount)
	{
	Balance=Balance + amount ;	
	}
	public double getBalance() {
		return Balance;
	}
	
	
}
