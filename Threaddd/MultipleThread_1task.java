package Threaddd;

public class MultipleThread_1task extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("This is run method");
	}
	public static void main(String[] args) 
	{
		MultipleThread_1task mt = new MultipleThread_1task();
		MultipleThread_1task mt2 = new MultipleThread_1task();
		mt2.start();
		mt.start();
	}


}
