package NewFeatures;

import java.util.ArrayList;
/*
 * forEach using lambda
 */
public class ForEachEg {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<>();
		al.add("Apple");
		al.add("Rose");
		al.add("Mango");
		al.add("apple");
		System.out.println("Iterating by lambda Expression : ");
		al.forEach(ab->System.out.println(ab));
		
	}

}
