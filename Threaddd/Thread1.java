package Threaddd;

public class Thread1 extends Thread
{
	
	public void run() 
	{
		System.out.println("This is run Method ");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("AAAAAAA");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		Thread1 t = new Thread1();
		t.start();
		//System.out.println(t.getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
		
	}
}