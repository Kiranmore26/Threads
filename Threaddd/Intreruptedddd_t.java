package Threaddd;

public class Intreruptedddd_t extends Thread
{
	@Override
	public void run() 
	{
		try 
		{
			System.out.println(Thread.currentThread().isInterrupted());
			System.out.println(Thread.interrupted());
			System.out.println(Thread.currentThread().isInterrupted());
			
			
			for (int i = 1; i < 5; i++)
			{
				System.out.println(i);
				sleep(1000);
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		Intreruptedddd_t ii = new Intreruptedddd_t();
		ii.start();
		//ii.interrupt();
	}
}
