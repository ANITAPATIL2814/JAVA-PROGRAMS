import java.util.Scanner;

public class exception_handling_ex {

	public static void main(String[] args) {
		try {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter num1");
            int x=sc.nextInt();
            System.out.println("Enter num2");
            int y=sc.nextInt();
            System.out.println(x/y);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
	}


