import java.util.Scanner;

public class MainClass 
{
public static void main(String args[])
{
	int ch;
	Scanner scr=new Scanner(System.in);
	while(true)
	{
		System.out.println("Press 1 to find the area of the circle\nPress 2 for finding the area of the sector\nPress 3 to find the area of the segment\nPress 0 to exit");
	
		ch=scr.nextInt();
	
		switch(ch)
		{
		case 1:
			System.out.println("Enter the radius");
			double r=scr.nextDouble();
			Circle C=new Circle(r);
			System.out.println("Area of the Circle="+C.Area_Circle());
			break;
		
		case 2:
			System.out.println("Enter the radius and control angle(in radians) of the sector");
			double rs=scr.nextDouble();
			double ang=scr.nextDouble();
			Sector S=new Sector(rs,ang);
			System.out.println("Area of the sector="+S.Area_Sector());
			break;
		
		case 3:
			System.out.println("Enter the radius and length of the segment");;
			double rsg=scr.nextDouble();
			double h=scr.nextDouble();
			Segment SG=new Segment(rsg,h);
			System.out.println("Area of the segment="+(SG.Area_Segment()));
			break;
		case 0:
			System.exit(0);;
		default:
			System.out.println("Enter a valid choice ");
		}
	}
}
}
