package OOPS;
//subclass 3
public class seats {
	private int seatNumber;
	  //parent class constructor with class property

    public seats(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public   void display(){
        //non static parent class
        System.out.println("seatNumber is : "+ seatNumber);
       
    }
}
