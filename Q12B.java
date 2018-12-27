import java.util.*;

/*b. Create a linked list of names (String type). Use an Iterator to traverse through the list and print those
names whose length is < 5.*/
class ListIterate
{
	LinkedList<String> llstr ;
	ListIterate()
	{
		llstr = new LinkedList<String>();
	}
	void addNames(String name)
	{
		llstr.add(name);
	}
	void print_Iterator()
	{
		Iterator<String> it = llstr.listIterator();
		String val;// = it.next();
		while(it.hasNext())
		{   val = it.next();
			int p = val.length();
			if(p<5)
			{
				System.out.println(val);
			}
		}
		System.out.println("Iterates through the linked list");
	}
}
public class IteratorLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListIterate listnames = new ListIterate();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter an option");
			System.out.println("enter 'a' to add names");
			System.out.println("enter 'p' to print names with length < 5");
						
			char ch = sc.next().charAt(0);
			switch(ch)
			{
			case 'a': System.out.println("Enter the names");
					  String name = sc.next();
					  listnames.addNames(name);
					  break;
			case 'p': listnames.print_Iterator();
					  break;
			}
		
	}

	}
}

