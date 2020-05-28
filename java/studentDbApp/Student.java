package studentDbApp;
import java.util.*;

public class Student 
{
	private String firstName;
	private String lastName;
	private String year;
	private String studentId;
	private static int initialId = 1000;
	private String course = "";
	private int balance;
	private static int costPerCourse = 600;
	Scanner keyboard = new Scanner (System.in);

	//class constructor - asks for name and year
	public Student()
	{
		System.out.print("Enter the First name :");
		this.firstName = keyboard.nextLine();
		System.out.print("Enter the Last name :");
		this.lastName = keyboard.nextLine();
		do {
			System.out.print("Enter the year-[1 for junior, 2 for senior, 3 for super-senior] : ");
			this.year = keyboard.nextLine();	
			if(!(year.equals("1")) &&!(year.equals("2")) && !(year.equals("3")))
				System.out.println("\nInvalid selection.Try again!");
			else
			{
				break;
			}
		}while(true);
		setId();
	}

	private void setId()
	{   
		initialId++;
		this.studentId = year + "" + initialId;
		System.out.println("\nStudent ID sucessfully generated for " +firstName.toUpperCase() + " "+ lastName.toUpperCase() + "!! ID is " + studentId + ".\n");
	}

	//chose course
	public void enroll()
	{
		HashMap <Integer,String> Subjects = new HashMap <Integer,String> ();		
		Subjects.put(1, "History-101");
		Subjects.put(2, "Mathematics-101");
		Subjects.put(3, "English-101");
		Subjects.put(4, "Chemistry 101");

		System.out.println("****COURSE REGISTRATION PORTAL******\n\nCourses are : " + Subjects  );
		System.out.println("Note : Each course costs " +costPerCourse );
		while(true)
		{
			System.out.print("\nPlease enter course (7 to exit):");
			int input = keyboard.nextInt();
			if(input !=7)
			{
				this.balance = balance +costPerCourse;
				this.course =  course +" "+ Subjects.get(input);
				System.out.println("Great choice !You have enrolled for:" + course+ " .The balance is " + balance);  
			}
			else
			{
				break;
			}
		}
	}

	public void getBalance()
	{
		System.out.println("Balance is :" + balance );

	}

	public void payTution()
	{
		System.out.println("*****PAYMENTS PORTAL******!!!");
		getBalance();
		System.out.println("How much do you to pay?");
		int amount = keyboard.nextInt();
		if(amount!=0)
		{
			System.out.print("Press 1 to confirm : ");
			int confirm = keyboard.nextInt();
			if(confirm ==1)
			{
				this.balance = balance - amount;
				System.out.print("Transaction successful!"+ " Balance is :"+ this.balance);
			}
		}
		else
			System.out.println("okay!");
	}

	public void showInfo()
	{
		String info = "\n***STUDENT INFO *******\n\nName  \t:" + firstName.toUpperCase() +  " " +lastName.toUpperCase() + "\n" +
				"ID \t:" + studentId + "\n"  +"Courses : " + course +  "\n" +
				"Balance :"+ balance +"$";
		System.out.println(info);
	}
}

