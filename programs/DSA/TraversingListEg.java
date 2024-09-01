
package DSA;

import java.util.*;

public class TraversingListEg {

	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList<>();//arraylist object
		arr.add(78);//add ele with an object
		arr.add(72);
		arr.add(20);
		arr.add(10);
		arr.add(72);
		arr.add(30);
		arr.add(40);
		arr.add(70);
		arr.add(10);
		arr.add(72);
		arr.add(30);
		
		//traversing using for loop
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+ " - ");
		}
		System.out.println();
		
		
		//traversing using for eacn
		for(int  a: arr) {
			System.out.print(a+ "  ");

		}
		System.out.println();
		
		
		//traversing using iterator : it has only  one function which is hasNext
		Iterator<Integer> it= arr.iterator(); //iterator() with an object 
		while(it.hasNext()) {   //check if iterator has elements
			System.out.print(it.next()+" "); //78 72 20 10 72 30 40 70 10 72 30 
		}
		System.out.println();

		
		//traversing using list iterator : it has only two  function which is hasNext, hasPrevious
		ListIterator<Integer> lt= arr.listIterator();
		while(lt.hasNext()) {  // check if iterator has  element in forward direction
			System.out.print(lt.next()+" "); //78 72 20 10 72 30 40 70 10 72 30 
		}
		System.out.println();
		
		
		while(lt.hasPrevious()) { // check if iterator has  element in backward(reverse) direction
		System.out.print(lt.previous()+" "); //30 72 10 70 40 30 72 10 20 72 78 
		}

	}

}
