package com.sarg.applications.emailgenerator;
import java.util.Scanner;

public class Email
{
	private String firstName;
	private String lastName;
	private String password;
	private String Email;
	private int passwordLength = 8;
	String department;
	private int capacity = 200;

	//constructor
	public Email(String firstName,String lastName)
	{
		this.firstName =firstName;
		this.lastName =lastName;
		department =this.getDepartment();
		Email = firstName.toLowerCase() + "_" + lastName.toLowerCase() +  "."  +department+ "@company.com";

		this.password = getPassword(passwordLength);		
		System.out.println("Email id is :" + Email );
		System.out.println("The password is :"+ password);
	}

	//get the department
	private String getDepartment()
	{
		System.out.println("Welcome to new Employee Email app!");
		System.out.println("\nEnter the department:\n1 for Sales\n2 for Dev\n3 for Accounts");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		switch(choice)
		{
		case 1 :return "sales";
		case 2 :return "dev";
		case 3 :return "Accounts";
		default : return "unknown";
		}
	}
	
	//generate random password
	private String getPassword(int length)
	{
		String optionSet = "ABCDEFIJKLMNOPQRSTUVWX0123456789";
		char [] password = new char[length]; 
		for(int i =0;i<length;i++)
		{
			int rand = (int)(Math.random()*optionSet.length());
			password[i] = optionSet.charAt(rand);
		}
	   return new String(password);		
	}	
	
	//setters
	public String setPassword(String newPassword)
	{
		this.password = newPassword;
		return "New Password is: " + password;
	}
	
	
	public int setCapacity(int capacity)
	{
		this.capacity = capacity;
		return capacity; 
	}
	
	public String setAltEmail(String email)
	{
		this.Email = email;
		return Email;
	}
	
	//getters
	public int getCapacity()
	{
		return capacity;
	}
	
	public String getAltEmail() 
	{
		return Email;
	}
	
	
	public String showInfo()
	{
		return "The email is : " +Email +"\nThe capacity is :" + capacity;
	}
	}
	




