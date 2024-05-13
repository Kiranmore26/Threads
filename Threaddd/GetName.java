package Threaddd;

public class GetName
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("kiran");
		System.out.println(Thread.currentThread().getName());
		//System.out.println(10/0);

	}
}
