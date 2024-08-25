
public class mainclass {

	public static void main(String[] args) {
		//library,book,user
		//subclass 1
		user u=new user("abc",1,20);
		//invoke parent class with child class object
		u.display();
		//subclass 2
		library l=new library(10,500,200);
		l.display();
		//subclass 3
		book b=new book("anita","abitapatil",12);
		b.display();

	}

}
