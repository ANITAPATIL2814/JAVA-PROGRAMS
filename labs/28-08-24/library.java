//subclass3 - library
public class library extends mainclass{
	
	//parent class property
 	private int return_book;
    private int collections;
    private int borrow_book;

  //parent class constructor with class property
    public library(int return_book,int collections,int borrow_book){
    	
        this.return_book=return_book; //class_name.constructor_name = both are same
        this.collections=collections;
        this.borrow_book=borrow_book;
    }
    //non static parent class
    public   void display(){
    	
	        System.out.println("Return book is: "+ return_book);
	        System.out.println("collection of books : "+collections);
	        System.out.println("how much do u borrow : "+ borrow_book);
	    }
	

}