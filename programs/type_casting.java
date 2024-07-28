import java.util.Scanner;

public class type_casting {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        short num= sc.nextShort();
        System.out.println("short datatype : "+num);
        long num1=sc.nextLong();//widening
        System.out.println("long datatype : "+num1);
        //-----------------------------------------

        System.out.println("enter 2 nd number : ");
        double num2 = sc.nextDouble();
        System.out.println("double datatype :"+num2); //12.24
        int num3= (int) num2; //narrowing
        System.out.println("int datatype: "+num3); //12
   } 
}
