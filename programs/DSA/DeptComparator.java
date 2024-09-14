package DSA;
/*
 * compare based on two - DeptComparator, AgeComparator
 * implement - employee class
 * main class - ComparatorEg
 */
import java.util.Comparator;

public class DeptComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
			return o1.empDept.compareToIgnoreCase(o2.empDept); // for string only to include upppercase and lowercase
	}

}
