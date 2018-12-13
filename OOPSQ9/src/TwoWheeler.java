import  java.util.*;
public class TwoWheeler extends Vehicle {
	public String type;
	public String color;
	public TwoWheeler()
	{
		super();
		type="";
		color="";
	}
	
	public int getData()
	{
		System.out.println("Enter the type of vehicle ,the color of the vehicle and year of manufacture");
		Scanner scr=new Scanner(System.in);
		type=scr.next();
		color=scr.next();
		int year=scr.nextInt();
		return year;
	}
	
	public void putData()
	{
		y_o_m=getData();
	}
}
