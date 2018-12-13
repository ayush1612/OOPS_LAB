package ISE;
import java.util.*;
import Default.*;
public class ISE_department extends Faculty implements Department{
    public int n;
    public Faculty fac[];
    public ISE_department()
    {
        n=0;
    }
    public void readData()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the number of faculties:");
        String no=scr.next();
        n=Integer.parseInt(no);
        fac=new Faculty[n];
        for(int i=0;i<n;i++)
        {
            try {
            System.out.println("Enter the faculty details of "+(n)+" faculty");
            System.out.println("Enter the name , designation,age,years_of_experience,joining_date,subjcets handle");
            fac[i]=new Faculty();
            fac[i].name=scr.next();
            fac[i].designation=scr.next();
            String ag=scr.next();
            fac[i].age=Integer.parseInt(ag);
            if(fac[i].age>58)
                throw new AgeException("Age>58");
            String yr=scr.next();
            String jd=scr.next();
            String sh=scr.next();
            fac[i].years_of_experience=Integer.parseInt(yr);
            fac[i].joining_date=Integer.parseInt(jd);
            fac[i].sub_hand=Integer.parseInt(sh);
             }
            catch(AgeException e)
            {
                System.out.println(e);
                
            }
    }
        scr.close();
    }
    public void printData()
    {
        for(int i=0;i<n;i++)
        {
            if(fac[i].years_of_experience>=20)
            {
            System.out.println("Details of the "+(i+1)+" faculty");;
            System.out.println("Name:"+fac[i].name);
            System.out.println("Designation:"+fac[i].designation);
            System.out.println("Age:"+fac[i].age);
            System.out.println("Years of experience:"+fac[i].years_of_experience);
            System.out.println("Joining date:"+fac[i].joining_date);
            System.out.println("Subject Handle:"+fac[i].sub_hand);
        }
        }
    }    

}
