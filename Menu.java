import java.util.Scanner;

public class Menu {
    static void display(){
        System.out.println("1. Tea(Rs. 20) : ");
        System.out.println("2. Black Coffee(Rs. 25) : ");
        System.out.println("3. Coffee (Rs. 30) : ");
        System.out.println("4. Samosa(Rs. 35) : ");
        System.out.println("5. Chocolate Cookie(Rs. 40) : ");
        System.out.println("6. Generate Bill & Exit ");
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Cafe : ");
        int sum=0;
        while (true) {
            Menu.display(); //becz method is static so that we call using class name. method name
            System.out.print("Enter your choice : ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter quantity : ");
                    int a = sc.nextInt();
                    sum = sum + 20 * a ;
                    break;
                case 2:
                    System.out.print("Enter quantity : ");
                    int b = sc.nextInt();
                    sum = sum + 25 * b;
                    break;
                case 3:
                    System.out.print("Enter quantity : ");
                    int c = sc.nextInt();
                    sum = sum + 30 * c;
                    break;
                case 4:
                    System.out.print("Enter quantity : ");
                    int d = sc.nextInt();
                    sum = sum + 35 * d;
                    break;
                case 5:
                    System.out.print("Enter quantity : ");
                    int e = sc.nextInt();
                    sum = sum + 40 * e;
                    break;
                case 6:
                    System.out.println("Total bill is : "+sum);
                    System.out.println("Thank u for your order !!");
                    System.out.println("-------------------------------");
                    break;
            }    
        }
    }
}
