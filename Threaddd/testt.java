package Threaddd;

public class testt implements Runnable
{
	 public void run() 
	{
		System.out.println("this is run method");

	}
	 public static void main(String[] args) 
	 {
		 testt tt = new testt();
		Thread t = new Thread(tt);
		System.out.println(t.isAlive());
		System.out.println(Thread.currentThread().getName());	
		System.out.println(t.getName());
		t.start();
		System.out.println(t.isAlive());
	 }
	 
}
