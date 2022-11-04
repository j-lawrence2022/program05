// Application: Program 5
// Name:        Brad Messner
// GitHub User: j-lawrence2022
// Date:        Nov 3, 2022
// Version:     1.0
// Description: Classes and Bank accounts 

import java.util.Scanner;

public class BankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create scanner for keyboard input and create checking and saving account
		Scanner keyboard = new Scanner(System.in);
		Bankaccount checking = new Bankaccount();
		Bankaccount savings = new Bankaccount();
		double dep,wit,tr;
		
		//create initial balances for checking and savings
		checking.setbalance(100.00);
		savings.setbalance(200.00);
		savings.accountType ='S';
		
		//create menu for account types
		int choice = 0;
		int accounttype = 0;
		System.out.println("Account type");
		System.out.println("1. Checking ");
		System.out.println("2. Saving");
		System.out.println("3. Exit");
		accounttype = keyboard.nextInt();
		
		//if statement if choice is 1
		if (accounttype ==1)
		 {
	do
	{
		//create menu for checking account
	System.out.println("1. Check your balance");
	System.out.println("2. Deposit Cash");
	System.out.println("3. Withdraw Cash");
	System.out.println("4. transfer");
	System.out.println("5. Exit");
	System.out.println("Enter youre choice");
	choice = keyboard.nextInt();
	
	
	//if statements depending on the number from the menu chosen
	if(choice <1 || choice>6)
	{
		System.out.println("This choice is invalid please choose another.");
	} 
	
	if(choice ==1)
	{
		System.out.println("Your checking balance is currently " + checking.getbalance());	
	}
	
	if (choice ==2)
	{
		System.out.println("How much money would you like to deposit?");
		dep= keyboard.nextInt();
		checking.addDeposit(dep);
		System.out.println("Your balance is now " +checking.getbalance());
	}
	
	if(choice ==3)
	{
		System.out.println("Enter the amount you want to withdraw from your account");
		wit = keyboard.nextDouble();
		checking.subwithdraw(wit);
		System.out.println("Your balance is now " +checking.getbalance());
	}
	if(choice ==4)
	{
		System.out.println("enter the amount you want transfered ");
		tr = keyboard.nextInt();
		checking.transfer(tr);
		System.out.println("Your balance is now " +checking.getbalance());
	}
	
	if(choice == 5)
	{
		break;
	}
		
		
	} while (choice !=5);
		 }
		if (accounttype == 2)
		{
			do
			{
				//create menu for checking account 
			System.out.println("1. Check your balance");
			System.out.println("2. Deposit Cash");
			System.out.println("3. Withdraw Cash");
			System.out.println("4. transfer");
			System.out.println("5. Interest");
			System.out.println("6. Exit");
			System.out.println("Enter youre choice");
			choice = keyboard.nextInt();
			
			//if statements for choices from menu
			if(choice <1 || choice>6)
			{
				System.out.println("This choice is invalid please choose another.");
			} 
			
			if(choice ==1)
			{
				System.out.println("Your checking balance is currently " + savings.getbalance());	
			}
			
			if (choice ==2)
			{
				System.out.println("How much money would you like to deposit?");
				dep= keyboard.nextInt();
				if(accounttype == 1)
				{
				checking.addDeposit(dep);} else
				{
					savings.addDeposit(dep);
				}
				System.out.println("Your balance is now " +savings.getbalance());
			}
			
			if(choice ==3)
			{
				System.out.println("Enter the amount you want to withdraw from your account");
				wit = keyboard.nextDouble();
				checking.subwithdraw(wit);
				System.out.println("Your balance is now " +savings.getbalance());
			}
			if(choice ==4)
			{
				System.out.println("enter the amount you want transfered ");
				tr = keyboard.nextInt();
				checking.transfer(tr);
				System.out.println("Your balance is now " +savings.getbalance());
			}
			
			if(choice == 5)
			{
			savings.interest();	
			System.out.println("The balance plus interest is " +savings.getbalance());	
			
		}
			if(choice == 6)
			{
				break;
			}
			} while (choice!=6);
			
			
			
			
			 }
		 
		 }

	}

