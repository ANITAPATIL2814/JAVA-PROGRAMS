public class book extends mainclass {

	
 	private String title;
    private String author;
    private int ISBN;
    

    public book(String title,String author,int ISBN){
    
        this.title=title; //class_name.constructor_name = both are same
        this.author=author;
        this.ISBN=ISBN;
       
    }
    		public   void display(){
		        System.out.println("title is : "+ title);
		        System.out.println(" author is : "+author);
		        System.out.println("id is : "+ ISBN);
        
    }
	

}
