package Threaddd;
//multiple task with Multiple Thread

class Demo extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("this is Demo run method");
	}
}

public class Multitask_multithread extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("This is run method");
	}
	public static void main(String[] args) 
	{
		Demo  d= new Demo();
		Multitask_multithread m = new Multitask_multithread();
		d.start();
		m.start();
	}
	
}
