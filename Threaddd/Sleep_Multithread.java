package Threaddd;

class show extends Thread
{
	public void run() 
	{
		for(int i=1;i<5;i++)
		{
			try
			{
					sleep(1000);
					System.out.println(i+"  "+Thread.currentThread().getName());
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
	}
}

public class Sleep_Multithread extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<5;i++)
		{
			try
			{
					sleep(1000);
					System.out.println(i+"  "+Thread.currentThread().getName());
			}
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) 
	{
		Sleep_Multithread sm = new Sleep_Multithread();
		sm.start();
		show sm2 = new show();
		sm2.start();
	}
}
