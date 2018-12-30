import java.util.Scanner;

public class Recursive_Fibonacci {

	static int fib(int n)
	{
		if(n==1)return 0;
		if(n==2)return 1;
		return(fib(n-1)+fib(n-2));
	}
	public static void main(String args[])
	{
		int n;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number of sequences");;
		n=scr.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.print(fib(i)+"  ");
			i++;
		}
	}
}
