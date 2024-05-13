package Threaddd;
//anonymous class in which thread is run

abstract class Test implements Runnable
{
	@Override
	abstract public void run() ;
	
}
public class Anonymous_multiplethread extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("this is run method");
		
	}
	public static void main(String[] args) 
	{
		Test t = new Test() 
		{
			@Override
			public void run() 
			{
				System.out.println("this is test run Method");
			}
		};
		Thread t1 = new Thread(t);
			Anonymous_multiplethread mtmt = new Anonymous_multiplethread();
			mtmt.start();
			t1.start();
			
	}
}
