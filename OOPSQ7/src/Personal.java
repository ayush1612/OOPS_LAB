import java.util.*;
public class Personal {
String name;
int age;
String edc;
double salary;
int y_o_e;
int nloans;
double loan;

Personal()
{
	name="";
	age=0;
	edc="";
	salary=0.0;
	y_o_e=0;
	nloans=0;
	loan=0.0;
}

void  isEligible()
{
	if(age>18)
		System.out.println("Eligible for loan");
	else
		System.out.println("Not eligible for loan");
}

void taxPay()
{
	System.out.println("Enter basic , hra and da");
	Scanner scr=new Scanner(System.in);
	double basic=scr.nextDouble();
	double hra=scr.nextDouble();
	double da=scr.nextDouble();
	salary=basic+0.1*hra+0.2*da;
	System.out.println("Amount of tax to be paid="+(0.2*salary));
}
void isEligiblePromotion()
{
	if(y_o_e>5)
		System.out.println("Eligible for promotion");
	else
		System.out.println("Not eligible for promotion");
}

void Display()
{
	System.out.println("Name of the Person:"+name);
	System.out.println("Age of the person:"+age);
	System.out.println("Years of experience of the person:"+y_o_e);
	System.out.println("Education:"+edc);
	System.out.println("Salary of the person:"+salary);
	System.out.println("Number of loans:"+nloans);
	System.out.println("Loan Amount:"+loan);
}

public static void main(String args[])
{
	Scanner scr=new Scanner(System.in);
	System.out.println("Enter the number of employees");
	
	int n=scr.nextInt();
	Personal P[]=new Personal[n];
	
	for(int i=0;i<n;i++)
	{
		P[i]=new Personal();
		
		System.out.println("Enter the name, age , education , years of experience ,number of loans , loan amount of the employee "+(i+1));
		P[i].name=scr.next();
	
		String ag=scr.next();
		P[i].age=Integer.parseInt(ag);
		
		P[i].edc=scr.next();
		
		
		String years=scr.next();
		P[i].y_o_e=Integer.parseInt(years);
		
		String nln=scr.next();
		P[i].nloans=Integer.parseInt(nln);
		
		String ln=scr.next();
		P[i].loan=Double.parseDouble(ln);
		
	}
	//to display the employee's details and the details for promotion and loan
	for(int i=0;i<n;i++)
	{
		P[i].Display();
		P[i].isEligible();
		P[i].isEligiblePromotion();
		P[i].taxPay();
	}
}
}
