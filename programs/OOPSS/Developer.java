package OOPS;

//subclass2 - developer
public class Developer extends Employee {
	private String projectName;
	private String ProgrammingLang;
	public Developer(String name, int empId, String DateOfJoining,String projectName,String ProgrammingLang) {
		super(name, empId, DateOfJoining);
		this.projectName=projectName;
		this.ProgrammingLang=projectName;
	}
	
	//override parent class
    public void display(){
    	super.display();//refer parent class
    	//print child class property
    	System.out.println("Project Name : "+projectName);
    	System.out.println("Programming language : "+projectName);
    }
}
