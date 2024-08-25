//subclass1 - user
public class user extends mainclass  {
	
		 //parent class property
		 	private String name;
		    private int id;
		    private int list;
		
		  //parent class constructor with class property
		    public user(String name,int id,int i){
		        this.name=name; //class_name.constructor_name = both are same
		        this.id=id;
		        this.list=i;
		    }
		    //non static parent class
		    public   void display(){
			        System.out.println("Name is : "+ name);
			        System.out.println(" id is : "+id);
			        System.out.println("list of users : "+ list);
			    }
}
