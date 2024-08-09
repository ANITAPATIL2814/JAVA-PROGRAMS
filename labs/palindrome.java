//Q : Write a program to check if a given string or number is a palindrome.
// palindrome number : 1221 : 1221
public class palindrome {
    //palindrome number
    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        return n == rev;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221)); // true
        System.out.println(isPalindrome(123456)); // false

    }
}
