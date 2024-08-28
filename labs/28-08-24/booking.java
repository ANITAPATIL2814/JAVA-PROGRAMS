package OOPS;
//subclass 2
public class booking {
	private String user;
    private int showtime;
    private int bookedSeats;
	  //parent class constructor with class property

    public booking(String user, int showtime,int bookedSeats) {
        this.user = user;
        this.showtime = showtime;
        this.bookedSeats = bookedSeats;
    }
    //non static parent class

    public   void display(){
        System.out.println("user is : "+ user);
        System.out.println(" showtime is : "+showtime);
        System.out.println("bookedSeats  : "+ bookedSeats);
    }
}
