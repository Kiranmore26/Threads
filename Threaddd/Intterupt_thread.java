package Threaddd;

public class Intterupt_thread extends Thread
{
	@Override
	public void run() 
	{
		try
		{
		for (int i = 0; i < 5; i++) 
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
		Intterupt_thread it = new Intterupt_thread();
		it.start();
		it.interrupt();
	}
}
