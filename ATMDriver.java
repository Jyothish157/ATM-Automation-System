
import java.util.*;
class ATMDriver
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("WELCOME TO XYZ BANK ATM");
			int choice;
			int count =0;
			do
			{
				System.out.println("1.Withdraw\n2.Deposite\n3.Balance Enquiry\n4.Exit");
				System.out.print("Enter the choice : ");
				choice =  sc.nextInt();
				if(count<3)
				{
					switch(choice)
					{
						case 1:
						{
							System.out.println("Enter your amount to Widthraw");
							int amount = sc.nextInt();
							System.out.println("Enter your PIN :");
							int pin = sc.nextInt();
							if(ATM.pinChecker(pin) == true)
							{
								ATM.withdraw(amount);
							}
							else
							{
								count++;
								System.out.println("You Entered Wrong pin!! Try Again.");
							}
							break;
						}
						case 2:
						{
							System.out.println("Enter your amount to Deposite");
							int amount = sc.nextInt();
							System.out.println("Enter your PIN :");
							int pin = sc.nextInt();
							if(ATM.pinChecker(pin) == true)
							{
								ATM.deposit(amount);
							}
							else
							{
								count++;
								System.out.println("You Entered Wrong pin!! Try Again.");
							}
							break;
						}
						case 3:
						{
							System.out.println("Enter your PIN :");
							int pin = sc.nextInt();
							if(ATM.pinChecker(pin) == true)
							{
								ATM.balanceEnquiry();
							}
							else
							{
								count++;
								System.out.println("You Entered Wrong pin!! Try Again.");
							}
							break;
						}
						case 4:
						{
							choice++;
							System.out.println("Thank you for Using our Service.");
							break;
						}
						default:
							System.out.print("Sorry You Entered a Wrong Choice.Please Try Again. ");
					}
				}
				else
				{
					System.out.println("You Exceeds the limit of wrong pin transactions.Please Try Later!!");
				}

			}while(choice<5);

	}
}