//Q : Write a program to find the sum of the digits of a given number.

public class sum_of_digit {
    public static void main(String[] args) {
        //Write a program to find the sum of the digits of a given number.
        int num = 12345;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
            }
            System.out.println("The sum of the digits is: " + sum);
            }
    }

    



