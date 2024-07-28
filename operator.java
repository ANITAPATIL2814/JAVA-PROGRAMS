import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number"); 
        int num1=sc.nextInt(); //num1 : 10
        int num2=sc.nextInt(); //num2 :5
        System.out.println(num1+num2);//addition : 15
        System.out.println(num1>num2);//relational : T
        String s=(num1>=num2) ? "great":"less";  //great 
        System.out.println("ternary : "+s);
        System.out.println("post increment : "+num1++); //10  
        System.out.println(--num1); //pre decre //10
        System.out.println("after post :"+ num1); //10
        System.out.println( num1>num2 && num1>num2); //logical : T && T :T
        System.out.println(num1+=num2); //11+5 : 16

        //constant variable 
        final int a =10; //cannot assign a value to final variable a
        // a++;
        System.out.println(a);
        
    }
}
