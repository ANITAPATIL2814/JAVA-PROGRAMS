//Q : Write a program to find the largest of three numbers.
public class large3num {
    public static int findLargest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        }
        else if (num2 >= num1 && num2 >= num3) {
            return num2;
        }
        else {
            return num3;
        }
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        System.out.println("The largest number is: " + findLargest(num1, num2, num3));
    }

     
}
