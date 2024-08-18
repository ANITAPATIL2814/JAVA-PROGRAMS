package Strings;
/*
 *  * string builder - synchronized( parallel execution)
 *  mutable , less efficient
 *  append, insert, replace, delete, reverse, substring, chatAt , length
 */
public class stringbufferex {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("hello good morning");
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
