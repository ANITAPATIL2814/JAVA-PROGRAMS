package DSA;
//subclass : student

import java.util.*;
public class HashSetEg1 {

	public static void main(String[] args) {
		Student s1=new Student(1,"anita",9.9f);
		Student s2=new Student(5,"rutu",9.4f);
		Student s3=new Student(6,"ritesh",9.8f);
		Student s4=new Student(4,"dipak",9.5f);
		Student s5=new Student(2,"vasu",9.7f);
		Student s6=new Student(3,"utsav",9.6f);
		LinkedList<Student> ls= new LinkedList<>();
		ls.add(s1);
		ls.add(s4);
		ls.add(s6);
		ls.add(s2);
		ls.add(s5);
		ls.add(s3);
		Iterator<Student> it= ls.iterator();
		while(it.hasNext()) {  
			Student ss=(Student) it.next();
			System.out.println(ss.id +" "+ss.name+" "+ss.per); 
		}
	
		System.out.println("-----------");
		ls.remove(s3);
		
		//add more 
		Student s7=new Student(8,"abc",9.1f);
		Student s8=new Student(2,"xyz",9.2f);
		Student s9=new Student(9,"pqr",9.0f);
		ls.add(s7);
		ls.add(s8);
		ls.add(s9);
		
		Iterator<Student> it1= ls.iterator();
		while(it1.hasNext()) {  
			Student ss=(Student) it1.next();
			System.out.println(ss.id +" "+ss.name+" "+ss.per); 
		}
	}

}
