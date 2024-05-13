package Threaddd;

public class Join_threadd extends Thread
{
	Thread mainthread =null;
	@Override
	public void run() 
	{
		 
		try
		{
			 mainthread.join();
			for(int i =1;i<5;i++)
			{
				Thread.sleep(1000);
				System.out.println(i+"  " +currentThread().getName());
				sleep(1000);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);

		}
	}
	public static void main(String[] args) throws Exception
	{
		System.out.println("main thread");
	 Thread mainthread = Thread.currentThread();
		Join_threadd d = new Join_threadd();
		d.start();
		
		
			for(int i =1;i<5;i++)
			{
				System.out.println(i+"  " +Thread.currentThread().getName());
				mainthread.sleep(1000);
				
			}
		
	}
}
