package Threaddd;

public class Thread_priority extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("This is run method");
		Thread.currentThread().setPriority(2);

		System.out.println(Thread.currentThread().getPriority());

	}
	
	public static void main(String[] args) 
	{
		Thread.currentThread().setPriority(9);
		System.out.println(Thread.currentThread().getPriority());
		Thread_priority tp = new Thread_priority(); 
		
		tp.start();
	}
}
