package OOPS;
//subclass 4
public class showtime {
	 private String movie;
	    private String startTime;
	    private int seats;
		  //parent class constructor with class property
	    public showtime(String movie, String startTime, int seats) {
	        this.movie = movie;
	        this.startTime = startTime;
	        this.seats = seats;
	       
	    }
	    //non static parent class

	    public   void display(){
	        System.out.println("movie is : "+ movie);
	        System.out.println(" startTime is : "+startTime);
	        System.out.println("seats  : "+ seats);
	    }
}
