package OOPS;

public class CinemaBookingSystem {

	public static void main(String[] args) {
		//movie,booking,seats, showtime
		//subclass 1
		movie m= new movie("shree", "Sci-Fi", 148);
		m.display();
		//subclass 2
		booking b = new booking("anita", 2,5);
		b.display();
		//subclass 3
		 seats s= new seats(20);
		 s.display();
		//subclass 4
		 showtime s1=new showtime("shree","12",5);
		 s1.display();
		 
	}

}
