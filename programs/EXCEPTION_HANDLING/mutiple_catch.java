package EXCEPTION_HANDLING;

public class mutiple_catch {

	public static void main(String[] args) {
		try {
			//handle one exception at a time
			System.out.println("hello");
			String a="java"; //null pointer exception
			System.out.println(a.length());
			
			int num=50/0;
			System.out.println(num);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
