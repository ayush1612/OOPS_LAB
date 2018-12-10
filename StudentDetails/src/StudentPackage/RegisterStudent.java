package StudentPackage;
import Details.*;
import java.util.Scanner;

public class RegisterStudent implements Student {
    public int totalC;
    public int credits[]=new int[5];
    public int sub[]=new int[5];
    public RegisterStudent(){
        totalC=0;
        for(int i=0;i<5;i++)
        {
            sub[i]=0;
            credits[i]=0;
        }
    }
    
    public void readdata()
    {
    	
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter marks of five subjects");
        
        for(int i=0;i<5;i++)
        {
        	sub[i]=scr.nextInt();     
        }
        System.out.println("enter credit of 5 subjects");
        for(int i=0;i<5;i++)
        {
            credits[i]=scr.nextInt();
            totalC+=credits[i];
        }
        try
        {
            if(totalC>30)
                throw new CreditLimit("limit exceeded");
            
        }
        catch(CreditLimit c)
        {
        	System.out.println(c);
        }
        
        
    }

}

