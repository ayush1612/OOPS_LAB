import java.util.*;

/*12. a. Write a java program to implement queues of Strings using an ArrayList class of the Collection
framework.
*/

class QueueImplement
{
	ArrayList<String> astr ;
	QueueImplement()
	{
		astr = new ArrayList<String>(); // create an ArrayList of Strings
	}
	//Insert into queues - at front
	void insert_front(String st)
	{
		astr.add(st);
				
	}
	String remove_rear()
	{
		return astr.remove(0);
	}
	void display()
	{
		System.out.println("Printing queue "+astr);
	}
}
public class Lab12Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		QueueImplement qimp = new QueueImplement();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter an option");
			System.out.println("enter 'i' for insert");
			System.out.println("enter 'r' for delete");
			System.out.println("enter 'd' for display");
			
			char ch = sc.next().charAt(0);
			switch(ch)
			{
			case 'i': System.out.println("enter the string to be inserted");
					  String ins_str = sc.next();
				qimp.insert_front(ins_str);
				break;
			case 'r' : String del_str = qimp.remove_rear();
					   break;
			case 'd' : qimp.display();
						break;
			default: System.out.println("Queue operation complete");
					 System.exit(0);
					 	}
		}
		}
			}

