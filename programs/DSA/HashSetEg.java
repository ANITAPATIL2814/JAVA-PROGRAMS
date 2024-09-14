package DSA;
import java.util.*;
/*
 * set interface contain only unique elements
 * insertion order may differ based on type of set used
 * implement using hashset, linkedhashset, treeset (ascending/sorting order)
 * Hashset use hashing machanism , allows null value , insertion order not maintain - insertion based on hashcode
 */
public class HashSetEg {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<>();
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
