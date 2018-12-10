package ResultPackage;

public class InvalidSGPA extends Exception {
	String message;
	InvalidSGPA()
	{
		message="Invalid SGPA";
	}
	public String toString()
	{
		return message;
	}
}
