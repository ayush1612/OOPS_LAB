import java.util.*;

public class Complex 
{
	float real,imag;
	Complex()
	{
		real=0;
		imag=0;
	}
	
	void Add(Complex C)
	{
		float reala=real+C.real;
		float imaga=imag+C.imag;
		
		System.out.println("Sum="+reala+"+"+imaga+"i");
	}
	
	void subtract(Complex C)
	{
		float reals=real-C.real;
		float imags=imag-C.imag;
		
		System.out.println("Difference="+(reals)+"+"+imags+"i");
	}
	
	void multiply(Complex C)
	{
		float preal=(real*C.real)-(imag*C.imag);
		float pimag=(imag*C.real)+(real*C.imag);
		
		System.out.println("Product of the two complex Numbers="+(preal)+"+"+(pimag)+"i");
	}
	
	public static void main(String args[])
	{
		Complex C1=new Complex();
		Complex C2=new Complex();
		System.out.println("Enter the real and imaginary values of the first number");
		Scanner scr=new Scanner(System.in);
		C1.real=scr.nextFloat();
		C1.imag=scr.nextFloat();
		
		System.out.println("Enter the real and imaginary values of the second complex number");
		C2.real=scr.nextFloat();
		C2.imag=scr.nextFloat();
		
		C1.Add(C2);
		C1.subtract(C2);
		C1.multiply(C2);
	}
}