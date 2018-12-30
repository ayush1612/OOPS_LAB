import java.util.*;
public class account 
{
	int Accno;
	String name;
	int Phone_No;
	float balance_amt;
	static Scanner scr=new Scanner(System.in);
	void getinput()
	{
		System.out.println("Enter the account number of the Accountholder");
		Accno=scr.nextInt();
		System.out.println("Enter the name of the Accountholder");
		name=scr.next();
		System.out.println("Enter the phone number of the Accountholder");
		Phone_No=scr.nextInt();
		System.out.println("Enter the balance amount");
		balance_amt=scr.nextFloat();
	}
	
	void Deposit()
	{
		System.out.println("Enter the amount to be deposited");
		float deposit=scr.nextFloat();
		balance_amt=balance_amt+deposit;
	}
	
	void Withdraw()
	{
		System.out.println("Enter the amount to be withdrawn");
		float withdraw=scr.nextFloat();
		if(balance_amt<withdraw)
			System.out.println("Amount to be withdrawn is more than the balance amount");
		else
			balance_amt=balance_amt-withdraw;
	}
	
	public static void main(String args[])
	{
		account A=new account();
		A.getinput();
		while(true)
		{
			System.out.println("1.Withdraw  2.Deposit 0.Exit\nEnter your choice");
			int ch=scr.nextInt();
			switch(ch)
			{
			case 1:
				A.Withdraw();
				break;
			case 2:
				A.Deposit();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Wrong Choice");;
			}
			System.out.println("Amount :"+A.balance_amt);
			
		}
		
	}
}
