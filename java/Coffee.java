class Beverage
{	
	public void isFull() 
	{
		System.out.println("Your order is full!");
	}
}

class Coffee extends Beverage 
{
	
	public void addSugar(int cubes)
    {
		System.out.println("You added " + cubes + " sugar cubes.");
	}

	public static void main(String[] args) 
	{
		Coffee myOrder = new Coffee();
		myOrder.addSugar(2);
		myOrder.isFull();
	}
}
