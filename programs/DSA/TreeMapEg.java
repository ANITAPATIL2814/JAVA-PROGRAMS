package DSA;
/*
 * insertion order in asce manner
 * does not allow null value
 */
import java.util.TreeMap;
import java.util.Map;

public class TreeMapEg {

	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<>(); //key:Integer,  value:String
		hm.put(1, "abc");
		hm.put(2, "pqr");
		hm.put(3, "stu");
		hm.put(4, "def");
//		hm.put(null,null);
		hm.put(5, "mon");
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
	}

}
