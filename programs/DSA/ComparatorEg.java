package DSA;

import java.util.*;

/*
 * compare based on two - DeptComparator, AgeComparator
 * implement - employee class
 * main class - ComparatorEg
 * To sort object of user defined class 
 * used only for double sorting
 * method : Compare(object o1, object o2)
 * It is an interface so we need to implement
 */
public class ComparatorEg {

	public static void main(String[] args) {
		LinkedList<Employee> he= new LinkedList<>(); 
		he.add(new Employee(1,"aaa","It",20));
		he.add(new Employee(2,"vvv","CA",19));
		he.add(new Employee(3,"abc","Hr",30));
		he.add(new Employee(4,"ppp","admin",40));

		//sort based on DeptComparator
		System.out.println("Deptwise");
		Collections.sort(he,new DeptComparator());
		for(Employee e:he) {
			System.out.println(e.empid+" "+e.empName+" "+e.empDept+""+e.empAge);
		}
		
		//sort based on DeptComparator
		System.out.println("AgeWise");
		Collections.sort(he,new AgeComparator());
		for(Employee e1:he) {
			System.out.println(e1.empid+" "+e1.empName+" "+e1.empDept+""+e1.empAge);
		}
	}

}
