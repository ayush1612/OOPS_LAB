import java.util.*;
import java.io.*;
import java.lang.*;

class string
{	static Scanner sc = new Scanner(System.in);	
	static	String s1,s2,s3;
	
	static void extract()
	{int n,m;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	s1 = sc.nextLine();
	System.out.println("Enter the index you want to extract from");
	n = sc.nextInt();
	System.out.println("Enter the number of words you want to extract");
	m = sc.nextInt();
	System.out.println(s1.substring(n,n+m));
	}
	
	static void occurance()
	{Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	s1 = sc.nextLine();
		String temp[] = s1.split(" ");
		System.out.println("Enter the word you want to check occurance of");
		s2 = sc.next();
		int count = 0;
		for(int i = 0 ; i < temp.length ; i++)
		{
		System.out.println((temp[i].compareTo(s2)));
		if(temp[i].equals(s2))
		count++;
		}
	System.out.println("Number of occurances of "+s2+" are " + count);
	}
	
	static void replace()
	{Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	s1 = sc.nextLine();
	System.out.println("Enter the word you want to replace");
	s2 = sc.next();
	System.out.println("Enter the new word");
	s3 = sc.next();
	s1 = s1.replaceAll(s2,s3);
	System.out.println("String after replacement is\n "+ s1);
	
	}
	static void rearrange()
	{Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	s1 = sc.nextLine();
	char temp[] = s1.toCharArray();
	Arrays.sort(temp);
	for(int i = 0 ; i < temp.length ; i ++)
	System.out.print(temp[i]);
	}
	
	static void concatenate()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	s1 = sc.nextLine();
	System.out.println("Enter the String to concatenate");
	s2 = sc.next();
	s1 = s1.concat(s2);
	System.out.println("String concatenated" + s1);
	}
	static void compare()
	{Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	s1 = sc.nextLine();
	System.out.println("Enter the String to compare");
	s2 = sc.next();
	if(s1.equalsIgnoreCase(s2))
	{System.out.println("They are equal");
	}
	else 
	System.out.println("They are not equal");
	
	}

public static void main(String args[])
{	
	int n;
	while(true)
	{System.out.println("1.Compare\n2.Concatenate\n3.Rearrange\n4.Extract\n5.Occurance\n6.Replace");
	n = sc.nextInt();
	
	
	switch(n)
	{
	case 1:compare();
	break;
	case 2:concatenate();
	break;
	case 3:rearrange();
	break;	
	case 4: extract();
	break;
	case 5:occurance();
	break;
	case 6:replace();
	break;
	default:break;
	}
	}
}

}
