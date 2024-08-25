package EXCEPTION_HANDLING;

import java.util.Scanner;
//take all libraries from eligibility_exception which we created
public class user_defined_exception {
	public static void check(int age) throws eligibility_exception {
		if(age >=21 && age<=65) {
			System.out.println("you are eligible for getting 1500/- per month ");
		}else {
			throw new eligibility_exception("age should be between 21 to 65");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter age");
			int age=sc.nextInt();
			check(age);
		}
		catch(eligibility_exception e) {
			System.out.println(e);
		}
	}
}

