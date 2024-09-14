package DSA;
/*
 *does not allow null element
 *ignore duplicate , not allow
 *insertion order will in ascending 
 */

import java.util.*;
public class TreeSetEg {

	public static void main(String[] args) {
		TreeSet<String>hs=new TreeSet<>();
		hs.add("def");
		hs.add("ghi");
		hs.add("abc");	
		hs.add("jkl");
		hs.add("mno");
		hs.add("def");//duplicate element - not allow, don't take 
		hs.add("pqr");
		hs.add("stu");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}

}
