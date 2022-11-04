// Application: Program 5
// Name:        Brad Messner
// GitHub User: j-lawrence2022
// Date:        Nov 3, 2022
// Version:     1.0
// Description: Classes and Bank accounts

public class Bankaccount {

	private double balance;
	public char accountType;
	
	public Bankaccount()
	{
	balance = 0.00;
	accountType = 'C';
			
	}
	//create method for deposit 
	public void addDeposit(double dep)
	{
		balance = balance + dep;
	}
	//create method for checking balance 
	public void setbalance(double set)
	{
		balance = set;
	}
	//create methods for getbalance
	public double getbalance()
	{
	
	return balance;
	}
	//create methods for withdrawing money from balance
	public void subwithdraw(double wit)
	{
		if (balance<wit)
		{
			System.out.println("You dont have enough funds. choose another option.");
		}else
			{ balance = balance - wit;
			}
			
	}
	//create method for transfering money from account.
	public void transfer(double tr)
	{
		if (balance < tr)
		{
			System.out.println("You dont have enough funds. choose another option.");
		} else
		{
		balance = balance - tr;	
		}
	}
		
	public void interest()
		{
			balance = balance + balance * .014;
			
		} 
		
	{
	
}

	{
		
}
	
}
