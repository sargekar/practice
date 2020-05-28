// threads

class Load extends Thread
{
	public void run()
	{  
		System.out.println("Hello! This is the first thread");
	}
}

class Load_2 implements Runnable
{
	public void run()
	{
		System.out.println("This is the second thread");
	}
}
public class myThread
{
	public static void main(String args[])
	{
		Load thread1 = new Load();
		thread1.start();
		
		Thread thread2 = new Thread(new Load_2());
		thread2.start();
	}
}


