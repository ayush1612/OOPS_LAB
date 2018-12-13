
public class MyTwoWheeler extends TwoWheeler{
	String name;
	MyTwoWheeler()
	{
		super();
		name="";
	}
	public static void main(String args[])
	{
		TwoWheeler T=new TwoWheeler();
		T.putData();
		System.out.println("Type of vehicle:"+T.type+"\nColor of vehicle:"+T.color+"\nYear of manufacture:"+T.y_o_m);
		
	}
}
