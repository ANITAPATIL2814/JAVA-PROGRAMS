/*
 * throw: used to intentionally throw an exception
 * throws: used as method signature , to tell the user or developer that this method might throw an  exception
 */
package EXCEPTION_HANDLING;

import java.util.Scanner;

public class Throw_Throws {

	public static void excp(int x) throws Exception{
		if(x>0){
			System.out.println(10/x);
		}else {
			throw new ArithmeticException();
		}
	}
	public static void main(String[] args)throws Exception {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num1");
		int x=sc.nextInt();
	
			excp(x);
	}

}
