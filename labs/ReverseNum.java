// Program to reverse the digits of a given number.
//9869863740
public class ReverseNum {
    public static void main(String[] args) {
        // Reverse number
        int num = 2324;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10; // Update the value of num
        }
        System.out.println("Reverse of the number is: " + rev);
    }
}