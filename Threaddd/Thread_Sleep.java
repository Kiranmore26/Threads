package Threaddd;

public class Thread_Sleep extends Thread 

{

	public void run() 
	{
		for(int i=1;i<=10;i++)
		{ 
			try 
			{
			Thread.sleep(1000);
			System.out.println("This is run Method" + i);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Thread_Sleep t1= new Thread_Sleep();
		t1.start();
	}
}
