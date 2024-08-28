public class user extends mainclass  {
	
		 	private String name;
		    private int id;
		    private int list;
		
		    public user(String name,int id,int i){
		        this.name=name; //class_name.constructor_name = both are same
		        this.id=id;
		        this.list=i;
		    }
		    public   void display(){
			        System.out.println("Name is : "+ name);
			        System.out.println(" id is : "+id);
			        System.out.println("list of users : "+ list);
			    }
}
