package OOPS;
//subclass 1
public class movie {

	 private String title;
	    private String genre;
	    private int duration; // in minutes
	    //parent class constructor with class property
	    public movie(String title, String genre, int duration) {
	        this.title = title;
	        this.genre = genre;
	        this.duration = duration;
	    }
	  //non static parent class
	    public   void display(){
	        System.out.println("title is : "+ title);
	        System.out.println(" genre is : "+genre);
	        System.out.println("duration  : "+ duration);
	    }

}
