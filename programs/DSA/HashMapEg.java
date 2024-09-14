package DSA;
import java.util.*;
/*
 * Map Interface which allows to store key value pair/entry
 * key must be unique
 * implements using HashMap, LinkedHashMap, TreeMap
 * HashMap: allow one null key & multiple null value , maintain no order
 */
public class HashMapEg {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>(); //key:Integer,  value:String
		hm.put(1, "abc");
		hm.put(2, "pqr");
		hm.put(3, "stu");
		hm.put(4, "def");
		hm.put(null,null);
		hm.put(5, "mon");
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
	}
}
