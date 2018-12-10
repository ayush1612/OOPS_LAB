package ResultPackage;
import StudentPackage.*;

public class Result extends RegisterStudent {
	public double sgpa;
	
	public Result()
	{
		sgpa=0.0;
		
	}
	
	public void sgpa_calc()
	{
		double gpa=0.0;
		readdata();
		for(int i=0;i<5;i++)
			gpa=gpa+(credits[i]*Math.ceil(sub[i]/10.0));
		sgpa=gpa/totalC;
		try
		{if(sgpa>10)
			throw new InvalidSGPA();
	}
		catch(InvalidSGPA i)
		{
			System.out.println(i);
		}
	

}
}

