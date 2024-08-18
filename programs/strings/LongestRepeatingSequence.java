package Strings;

import java.util.Scanner;

public class LongestRepeatingSequence {
	//to check for longest string 
	static String CheckString(String s, String t) {
		int n=Math.min(s.length(),t.length());
		for(int i=0;i<n;i++) {//check character with original string 
			if(s.charAt(i)!=t.charAt(i)) {
				return s.substring(0,i);
			}
		}
		return s.substring(0,n);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		String newstr="";
		int n=str.length();

		for(int i=0;i<=n;i++) {
			for(int j=i+1;j<n;j++) {
				String a=CheckString(str.substring(i,n),str.substring(j,n));//checks for common factors in every substring
				//if current prefix is greater than previous one then it takes current one as longest repeating string
				if(a.length()>newstr.length()) newstr=a;
			}
		}
		System.out.println("longest repeating string: "+newstr);
	}
}
/*
op:
Enter String
String is mutable, String is non primitive, String is immutable
longest repeating string: e, String is 

 */
*/