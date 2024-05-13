package Threaddd;
// Stopping main thread from thread-0


public class Join_Thread extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			for(int i =1;i<5;i++)
			{
				Thread.sleep(1000);
				System.out.println(i+"  " +Thread.currentThread().getName());
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);

		}
		
	}
	public static void main(String[] args) throws Exception
	{
		Join_Thread jt = new Join_Thread();
		jt.start();
		jt.join();
		for(int j =1;j<=5;j++)
		{
			try
			{
				sleep(1000);
				System.out.println(j+"  " +Thread.currentThread().getName());
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
	}
}
