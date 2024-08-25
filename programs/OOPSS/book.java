//subclass2 - book
public class book extends mainclass {

	
	//parent class property
 	private String title;
    private String author;
    private int ISBN;
    

  //parent class constructor with class property
    public book(String title,String author,int ISBN){
    
        this.title=title; //class_name.constructor_name = both are same
        this.author=author;
        this.ISBN=ISBN;
       
    }
    //non static parent class
    		public   void display(){
		        System.out.println("title is : "+ title);
		        System.out.println(" author is : "+author);
		        System.out.println("id is : "+ ISBN);
        
    }
	

}
