import java.util.Scanner;

public class if_example {
    public static void main(String[] args) {
        /*
         *  Scanner sc= new Scanner(System.in);
        System.out.println("enter know programming or not Y/N :");
        String check=sc.next();
        //equals : comparison person , will not check case 
        //equalsIgnoreCase : it does not check uppercase to lowercase
        if(check.equalsIgnoreCase("yes")){ 
            System.out.println("knows programming lang");
        }
        else{
            System.out.println("not know programming lang");
        }
            ------------------------------------
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num 1");
        int num1=sc.nextInt();
        System.out.println("enter num 2");
        int num2=sc.nextInt();
        if(num1 == num2){
            System.out.println("num1 and num2 are equal");
        }
        else{
            System.out.println("num1 and num2 are not equal");
        }
       
   }
}
