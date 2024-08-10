public class fib_num {
        //fibonacci series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 , 144,

    public static void main(String[] args) {
        // Q : Write a program to generate the Fibonacci series up to a given number.
        int n = 10; 
        int a = 0; 
        int b = 1; 
        int count = 2; 
        System.out.println("Fibonacci Series up to " + n + " is:");
        while (count <= n) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            count++;
        }
        System.out.println();
    }
}
