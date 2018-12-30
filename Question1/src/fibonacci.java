import java.util.Scanner;

public class fibonacci {

	public static void main(String args[])
	{
		int a=0,b=1,n;
		System.out.println("Enter the number of sequences in the series");
		Scanner scr=new Scanner(System.in);
		n=scr.nextInt();
		
		if(n==1)
			System.out.println("0");
		else
		{
			System.out.print("0,1");
			for(int i=1;i<=n-2;i++)
			{
				int sum=a+b;
				System.out.print(","+(sum));
				a=b;
				b=sum;
			}
		}
	}
}
