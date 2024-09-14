package DSA;
import java.util.*;
/*
 * allow unique elements 
 * insertion order based on linkedlist
 * allow null value
 */
public class LinkedHashSetEg {

	public static void main(String[] args) {
		LinkedHashSet<String>hs=new LinkedHashSet<>();
		hs.add("abc");
		hs.add("def");
		hs.add("ghi");
		hs.add("jkl");
		hs.add("mno");
		hs.add("def");//duplicate element - not allow, don't take 
		hs.add(null); //allow
		hs.add("pqr");
		hs.add("stu");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
