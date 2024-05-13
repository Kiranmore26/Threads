package Threaddd;

public class Get_set_Thread extends Thread
{
	
	public void run() 
	{
		System.out.println("This is run Method ");
	}
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Get_set_Thread  t = new Get_set_Thread();
		System.out.println(t.getName()); 
		t.start();
		t.setName("Kiran");
		System.out.println(t.getName());
}
}
