//Q : Write a program to check whether a given number is a prime number.
//prime number : 2, 3, 5, 7, 11, 13..............
import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        //prime number
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==2){
            System.out.println("num is prime");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<=n-i;i++){
                if(n%i==0){
                    isPrime=false;
                }

            }
            if(isPrime==true){
                System.out.println("num is prime");
            }
            else{
                System.out.println("num is not prime");
            }
        }

        
    }
}
