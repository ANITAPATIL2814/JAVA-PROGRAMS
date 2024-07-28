import java.util.Scanner;

public class switch_case {
    /*
     * switch(condition){
     * case 1:
     * case2 :
     * default:
     * }
     */
    public static void main(String[] args) {
        char operator;
        double num1,num2,res;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1 : ");
        num1=sc.nextDouble();
        System.out.print("Enter num2 : ");
        num2=sc.nextDouble();
        System.out.print("Enter operator +, -, * ,/ : ");
        operator=sc.next().charAt(0); // charAt: for reading purpose
    
        switch(operator)
        {
            case '+':
                res=num1+num2;
                System.out.println("Addition is : "+res);
                break;
            case '-':
                res=num1-num2;
                System.out.println("Subtraction is : "+res);
                break;
            case '*':
                res=num1*num2;
                System.out.println("Multiplication is : "+res);
                break;
            case '/':
                res=num1/num2;
                System.out.println("Division is : "+res);
                break;
            default:
            System.out.println("Invalid operator !! Please Enter correct operator");
            }
        }
}

