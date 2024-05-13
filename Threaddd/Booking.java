package Threaddd;

 class Movie_tickets
{
	
	int total_seats=10;
	 void tickets (int seats)
	{
		 synchronized (this) {
			
		
		if(total_seats>=seats)
		{
			System.out.println("Seats are booked");
			total_seats=total_seats-seats;
			System.out.println("Remaning Seats : "+ total_seats);
		}
		 
		else
		{ 
			System.out.println("Seats are  not booked ....");
		}
		 }
	}
}
public class Booking extends  Thread
{
	static Movie_tickets mt;
	int seats;
	@Override
	public void run() 
	{
		mt.tickets(seats);
	}
	public static void main(String[] args) 
	{
		mt = new Movie_tickets();   	
		Booking b = new Booking();
		b.seats=2;
		b.start();
		
		Booking b1= new Booking();
		b1.seats=12;
		b1.start();
		
	}
}
