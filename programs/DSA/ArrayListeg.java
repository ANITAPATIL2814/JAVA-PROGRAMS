//group of objects is collections
/*
 * java util.*
 * store, access, insert, delete
 * List, Set,Map,interface
 * List interface : arraylist, Linkedlist, vector
 * List : ordered collection(insertion order maintain), can have duplicate element - common in all list
 * arraylist : dynamic array, stored based on index value, non homogeneous datatype(diff types of datatype can store)
 */
package DSA;
import java.util.*;
public class ArrayListeg {

	public static void main(String[] args) {
		
		ArrayList<Integer>arr=new ArrayList<>();//arraylist object
		
		//to check list is empty or not 
		System.out.println(arr.isEmpty());//true

		
		arr.add(78);//add ele with an object
		arr.add(72);
		arr.add(20);
		arr.add(10);
		arr.add(72);
		arr.add(0, 100); //explicit mention index value for adding element
		System.out.println(arr);//[100, 78, 72, 20, 10, 72]
		
		System.out.println(arr.size());//return length of array : 6
		
		//dyanmic array - it can change
		arr.add(30);
		arr.add(40);
		arr.add(70);
		System.out.println(arr);//[100, 78, 72, 20, 10, 72, 30, 40, 70]

		System.out.println(arr.isEmpty());//false 
		
		arr.remove(2); //remove element from index 2
		System.out.println(arr);// [100, 78, 20, 10, 72, 30, 40, 70]

		ArrayList<String> arr1= new ArrayList<>();
		arr1.add("Apple");
		arr1.add("BlackApple");
		arr1.add("IceApple");
		arr1.add("custerdApple");		
		arr1.add("mango");
		System.out.println(arr1);
		
	}

}
