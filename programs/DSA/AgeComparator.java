package DSA;

import java.util.Comparator;
/*
 * compare based on two - DeptComparator, AgeComparator
 * implement - employee class
 * main class - ComparatorEg
 */
public class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.empAge==o2.empAge)
			return 0;
		else if(o1.empAge>o2.empAge)
			return 1;
		else
			return -1;
	}

}
