/*
 * Try: a piece of code that is prone to exceptions should kept in try block
 * Catch: catch block catches the exception object and executes only when exception occurs
 */
package EXCEPTION_HANDLING;

public class try_catch {

	public static void main(String[] args) {
		try {
			//it get multiple exception but JVM handle only first exception. handle one exception at a time
			System.out.println("hello");
			String a="java"; //null pointer exception
			System.out.println(a.length());
			
			int num=50/0;
			System.out.println(num);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
