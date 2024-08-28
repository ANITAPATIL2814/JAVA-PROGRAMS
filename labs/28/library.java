public class library extends mainclass{
	
 	private int return_book;
    private int collections;
    private int borrow_book;

    public library(int return_book,int collections,int borrow_book){
    	
        this.return_book=return_book; //class_name.constructor_name = both are same
        this.collections=collections;
        this.borrow_book=borrow_book;
    }
    public   void display(){
    	
	        System.out.println("Return book is: "+ return_book);
	        System.out.println("collection of books : "+collections);
	        System.out.println("how much do u borrow : "+ borrow_book);
	    }
	

}
