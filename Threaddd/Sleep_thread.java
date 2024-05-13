package Threaddd;


public class Sleep_thread 
{

	public static void main(String[] args) throws Exception
	{
		for (int i =1;i <=10;i++) 
		{
			try 
			{
				Thread.sleep(2000);
				System.out.println(i);
			} 
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
			
		}
			
		
	}
}
