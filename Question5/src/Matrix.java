import java.util.*;
public class Matrix {
	int A[][]=new int[3][3];
	int B[][]=new int[3][3];
	int C[][]=new int[3][3];
	
	Matrix()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				A[i][j]=0;
				B[i][j]=0;
				C[i][j]=0;
			}
		}	
	}
	void input()
	{
		System.out.println("Enter 9 elements in the array");
		Scanner scr=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				A[i][j]=scr.nextInt();
		}
		
		System.out.println("Enter 9 elements in the other array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				B[i][j]=scr.nextInt();
		}
	}
	
	void Pro()
	{
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				int sum=0;
				for(int k=0;k<3;k++)
					sum=sum+(A[i][k]*B[k][j]);
				C[i][j]=sum;
			}
			
		}
	}
	void display()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(C[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		Matrix M=new Matrix();
		M.input();
		M.Pro();
		M.display();
		
	}
}
