package OOPS;

public class Hierarchical {

	public static void main(String[] args) {
		//subclass 1
		Manager m= new Manager("xy",123,"12-06-2024",20,"IT","anita@gmail.com");
		Manager m1=new Manager("ab",21,"22-06-2024",20,"Comm","patil@gmail.com");
		//invoke parent class with child class object
		m.display();
		m1.display();
		//subclass 2
		Developer d=new Developer("abc",145,"6-02-2024","amazon","java");
		d.display();//invoke parent class with child class object
		
	}

}
