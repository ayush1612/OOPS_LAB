package StudentPackage;
import ResultPackage.*;

public class MainClass {
	public static void main(String args[])
	{
		double cgp=0.0;
		Result R[]=new Result[2];
		System.out.println("Name of Student:"+Result.name+"\nBranch:"+Result.branch);
		for(int i=0;i<2;i++)
		{
			R[i]=new Result();
			R[i].sgpa_calc();
			System.out.println("SGPA for semester "+(i+1)+"="+R[i].sgpa);
		}
		
		for(int i=0;i<2;i++)
		{
			cgp=cgp+R[i].sgpa;
		}
		double cgpa=cgp/2;
		System.out.println("CGPA="+cgpa);
	}

}
