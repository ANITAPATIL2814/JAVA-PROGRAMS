package DSA;

import java.util.*;
//subclass : student
public class ArrayList1 {

	public static void main(String[] args) {
	Student s1=new Student(1,"anita",9.9f);
	Student s2=new Student(2,"vasu",9.7f);
	Student s3=new Student(3,"utsav",9.6f);
	Student s4=new Student(4,"dipak",9.5f);
	Student s5=new Student(5,"rutu",9.4f);
	Student s6=new Student(6,"ritesh",9.8f);
	
	ArrayList<Student>as= new ArrayList<>();
	as.add(s1);
	as.add(s2);
	as.add(s3);
	as.add(s4);
	as.add(s5);
	as.add(s6);
	
	Iterator<Student> it= as.iterator();
	while(it.hasNext()) {  
		Student ss=(Student) it.next();
		System.out.println(ss.id +" "+ss.name+" "+ss.per); 
	}

	}

}
