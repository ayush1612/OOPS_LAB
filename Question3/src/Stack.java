import java.util.*;

public class Stack {
	static int top=-1;
	static int S[]=new int[5];
	
	static void push(int n)
	{
		if(top<5)
		  S[++top]=n;
		else
			System.out.println("Overflow");
	}
	
	static void pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
			return;
		}
		int element=S[top--];
		System.out.println("Element removed="+element);
		
	}
	
	static void display()
	{
		for(int i=0;i<=top;i++)
			System.out.print(S[i]+" ");
	}
	
	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		while(true)
		{
			System.out.println("Press 1 to push.\nPress 2 for pop\nPress 3 for displaying\nPress 4 to exit");
			int ch=scr.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter the number");
				int n=scr.nextInt();
				push(n);
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong Choice");
			}
		}
	}
}
