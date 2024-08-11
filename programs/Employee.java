package OOPS;

public class Employee {
    //parent class property
    private String name;
    private int empId;
    private String DateOfJoining;
    //parent class constructor with class property
    public Employee(String name,int empId,String DateOfJoining){
        this.name=name; //class_name.constructor_name = both are same
        this.empId=empId;
        this.DateOfJoining=DateOfJoining;
    }
    //non static parent class
    public void display(){
        System.out.println("Name is : "+name);
        System.out.println("Employee id : "+empId);
        System.out.println("Date of Joining : "+ DateOfJoining);
    }
}