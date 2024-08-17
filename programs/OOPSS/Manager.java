package OOPS;

//subclass1 - Manager
public class Manager extends Employee{
  //child class property
  private int teamsize;
  private String dept;
  private String email;
  //child class constructor with parent property
  public Manager(String name,int empId,String DateOfJoining,int teamsize,String dept,String email){
      super(name,empId,DateOfJoining); //refer parent class property
      this.teamsize=teamsize;
      this.dept=dept;
      this.email=email;
  }
  //override parent class
  public void display(){
      super.display();//display parent class method
      //print child class property
      System.out.println("teamsize is : "+teamsize);
      System.out.println("dept is : "+dept);
      System.out.println("email is : "+ email);
  }
}