package Threaddd;

public class Thread_implement implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("this is Run method");
	}
	public static void main(String[] args) 
	{
		Thread_implement ti = new Thread_implement();
		Thread t = new Thread(ti);
		t.start();
	}

}
