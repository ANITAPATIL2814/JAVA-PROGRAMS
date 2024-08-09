// Q : Write a program to calculate the factorial of a given number.

public class factorial_num {
    //factorail of number
    public static void main(String[] args) {
        int num = 5; // input number
        int fact = 1; // factorial variable
        for (int i = 1; i <= num; i++) {
            fact = fact * i; // calculate factorial
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
