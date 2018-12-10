package StudentPackage;

public class CreditLimit extends Exception{
	public String message;
	public CreditLimit(String mssg)
	{
		message=mssg;
	}
	
	public String toString()
	{
		return message;
	}

}
