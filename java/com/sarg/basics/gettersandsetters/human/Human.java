package gettersandsetters.human;
//getters and setters
/***Main class *****/
class HumanData
{
	public static void main (String args[])
	{
		Human rose = new Human()	;
		rose.setAge(23);
		rose.setName("rose");
		rose.setOccupation("doctor");
		System.out.println(rose.getName() + " is "+ rose.getAge()+ " years old.She is a "+ 
		rose.getOccupation());
	}
}


public class Human
{

	String name;
	int age;
	String occupation;

	//get and set  name 

	public void setName(String human_name )
	{
		this.name = human_name;
	}

	public String getName()
	{
		return name ;
	}

	//get and set age
	public void setAge(int human_age)
	{
		this.age = human_age;
	}

	public int getAge()
	{
		return age;
	}

	//get and set occupation 
	public void setOccupation(String human_occ )
	{
		this.occupation = human_occ;
	}

	public String getOccupation()
	{
		return occupation;
	}
}


