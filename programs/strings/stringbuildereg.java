package Strings;
/*
 *  * string builder - non-synchronized( sequential execution)
 *  mutable , more efficient
 *  append, insert, replace, delete, reverse, substring, chatAt , length
 */
public class stringbuildereg {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("hello good morning");
		System.out.println(sb);//hello good morning
		System.out.println(sb.append(" how are you "));//hello good morning how are you 

		sb.replace(27,30,"my students");
		System.out.println(sb);//hello good morning how are my students 

		sb.insert(19,"Students ");
		System.out.println(sb);//hello good morning Students how are my students 

		System.out.println(sb.length());//48
		System.out.println(sb.substring(0,5));//hello

		System.out.println(sb.charAt(7));//o
	}

}
