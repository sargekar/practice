package studentDbApp;
import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("WELCOME TO STUDENT DATABASE APP!!\n");
		System.out.print("Enter the number of students : ");
		int length = userInput.nextInt();

		Student [] Students = new Student[length]; //array of objects

		for (int i = 0;i<length;i++)
		{   
			System.out.println("ENTER THE INFO BELOW FOR STUDENT " + (i + 1) + " -"); 
			Students[i] = new Student(); //creating an object of Student class
			Students[i].enroll(); //enroll method on class object
		}

		for (int j = 0;j<length;j++)
		{
			Students[j].showInfo(); //method on the object
		}
		
		userInput.close();
		System.out.println("\n*****Great Work!!All done!! ******");	
	}

}
