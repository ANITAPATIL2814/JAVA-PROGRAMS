package DSA;
/*
 * insertion order maintain
 *LinkedHashMap : allow one null key & multiple null value
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEg {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<>(); //key:Integer,  value:String
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
