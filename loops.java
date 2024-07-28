import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter num for table (for loop): ");
            int n=sc.nextInt();
            //for(initialization; condition; incre/decre)
            for(int i=1;i<=10;i++){
                System.out.println(n + " * " + i + " is : "+ (n*i));
            }
            /*
             while loop syntax:
             initialize
             while(condition){
                incre/decre
            }
             */
            System.out.println("Enter num for table (while loop) : ");
            int num1=sc.nextInt();
            int i=1;
            while(i<=11){
                System.out.println(num1 + " * " + i + " is : "+ (num1*i));
                i=i+2;
            }
            /*
            do while loop syntax:
            initialization
            do{
                incre/decre
            }while(condition);
             when condition is false then it will run at least once
             */
            System.out.println("Enter num for table (do while): ");
            int num2=sc.nextInt();
            int j=1;
             do{
                System.out.println(num2 + " * " + j + " is : "+ (num2*j));
                j++;
            }while(j<=5);
    }
}
