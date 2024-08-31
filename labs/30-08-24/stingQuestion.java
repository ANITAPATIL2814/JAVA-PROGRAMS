import java.util.Scanner;

public class stingQuestion {

	public static void main(String[] args) {
		
		
		
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        //Sum the lengths of  and .
	         int lengthSum = A.length() + B.length();
	         System.out.println(lengthSum);
	          //Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
	        if (A.compareTo(B) > 0) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        } 
	        //Capitalize the first letter in  and  and print them on a single line, separated by a space.
	}

}
