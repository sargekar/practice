
class Load extends Thread
{
	public void run()
	{  
		System.out.println("Hello! This is the first thread");
	}
}

class Load2 implements Runnable
{
	public void run()
	{
		System.out.println("This is the second thread");
	}
}
public class ThreadBasics
{
	public static void main(String args[])
	{
		Load thread1 = new Load();
		thread1.start();
		
		Thread thread2 = new Thread(new Load2());
		thread2.start();
	}
}


