package Threaddd;

public class SLeep_Thread2 extends Thread 
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				sleep(2000);
				System.out.println(i);
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public static void main(String[] args) 
	{
		SLeep_Thread2 s2 = new SLeep_Thread2();
		s2.start();
	}
}
