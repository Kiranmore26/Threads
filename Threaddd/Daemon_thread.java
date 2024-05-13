package Threaddd;

public class Daemon_thread extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("this is run method");
	}
	public static void main(String[] args) 
	{
		//System.out.println("this is main thread");
		
		
		Daemon_thread d = new Daemon_thread();
		d.setDaemon(true);
		d.start();
	}
}
