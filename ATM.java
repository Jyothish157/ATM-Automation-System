class ATM
{
	static double balance = 1200;
	static int epin = 8746;
	public static boolean pinChecker(int pin)
	{

		return (epin == pin);

	}
	public static void withdraw(double amount) 
	{
	
		if(amount > 0)
		{
			if(amount<balance)
			{
				if(amount%500 == 0 ||amount %100 == 0)
				{
					try
					{
						System.out.print("Your Transaction is Being Processed.");
						balance -= amount;
						Thread.sleep(2000);
						System.out.print(".");
						Thread.sleep(2000);
						System.out.println(".");
						Thread.sleep(2000);
						System.out.println("Amount Withdrawn Successfully.\nYour Available Balance is "+balance);
					}
					catch (InterruptedException e) 
					{
			            // Handle the exception
			            System.err.println("Thread was interrupted: " + e.getMessage());
        			}
				}
			}
			else
			{
				System.out.println("Sorry! Insufficient Balance!!");
			}
		}
		else
		{
			System.out.println("Sorry!! Please give a Valid Amount to Withdraw .");
		}

	}
	public static void deposit(double amount) 
	{
	
		if(amount > 0)
		{
			try
			{

				System.out.print("Your Transaction is Being Processed.");
				balance += amount;
				Thread.sleep(2000);
				System.out.print(".");
				Thread.sleep(2000);
				System.out.println(".");
				Thread.sleep(2000);
				System.out.println("Amount Deposited to your account.\nYour Available Balance is "+balance);
			}
			catch (InterruptedException e) 
			{
	            // Handle the exception
	            System.err.println("Thread was interrupted: " + e.getMessage());
     		}
		}
		else
		{
			System.out.println("Sorry!! Please give a Valid Amount to Deposit :( .");
		}

	}
	public static void balanceEnquiry()
	{
		try
		{
			System.out.print("Your Transaction is Being Processed.");
			Thread.sleep(2000);
			System.out.print(".");
			Thread.sleep(2000);
			System.out.println(".");
			Thread.sleep(2000);
			System.out.println("Your Available Balance is "+balance);
		}
		catch (InterruptedException e) 
		{
	        // Handle the exception
	        System.err.println("Thread was interrupted: " + e.getMessage());
     	}
	}
}