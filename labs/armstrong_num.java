public class armstrong_num {
    //armstrong number is a number that is equal to the sum of cubes of its digits
    //armstrong number : 1, 2, 3, 4, 5, 6, 7, 8, 9.
    public static void main(String[] args) {
        //Write a program to check whether a given number is an Armstrong number.
        int num = 371;
        int n = num;
        int sum = 0;
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
            }
            temp = num;
            while (temp != 0) {
                int rem = temp % 10;
                sum = sum + (int) Math.pow(rem, count);
                temp = temp / 10;
            }
            if (sum == n) {
                System.out.println(n + " is an Armstrong number");
                } else {
                System.out.println(n + " is not an Armstrong number");
            }
    }
}

