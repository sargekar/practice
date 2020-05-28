import java.util.ArrayList;

public class MyArrayList

{

	public static void main(String[] args) 
	{

        int a = 0 ;
		ArrayList <String> Names = new ArrayList <String>();
		Names.add("sam");
		Names.add("sid");
		Names.add("rahul");
		System.out.println("hello");
		System.out.println("arrayList contains "+ Names.size() + " elements");
		System.out.println(Names);
		
		// enhanced for loop
		for ( String element : Names)
		{
			System.out.println("The element at index "+ a + " is " + element);
			a++;
			
		}
	

	}

}
