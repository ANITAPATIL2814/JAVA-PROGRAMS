package OOPS;

//super-parent-base class
class Person{
	//parent class property 
	String name;
	String address;
	int height;
	int weight;
	String color;
	String lang;
	
	//parent non-static ()
	void personDetails() {
		System.out.println(name +" "+ address +" "+ color +" "+ lang +" "+ height +" "+ weight);
	}	
}
//sub-child-derived class 
class Student extends Person{
	//child class property
		String Uname;
		String standard;
		long phoneNum;
		int passingYear;
		//child non-static ()
		void educDetails() {
			System.out.println(Uname+" "+ standard+" "+ phoneNum+" "+ passingYear);
		}	
}
public class SingleHeritanceEg {
	public static void main(String[] args) {
		//child class object
		Student s = new Student();
		//initialize parent class property with child object 
		s.name="Tom";
		s.address="Vashi";
		s.height=5;
		s.weight=50;
		s.color="Fair";
		s.lang="Hindi";
		
		System.out.println("------ Personal Details --------");
		s.personDetails();  //invoke parent () with child object
		
		//initialize child class property with child object 
		s.Uname="Itvedant";
		s.phoneNum=789654123;
		s.standard="EnggSY";
		s.passingYear=2025;
		
		System.out.println("------ Educational Details --------");
		s.educDetails(); //invoke child () with child object

	}

}