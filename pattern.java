public class pattern {
    /*
     * 1 to n increasing  order
     static void printNumber(int n){
        int i,j;
        //outer loop - rows
        for(i=1;i<=n;i++){
            //inner loop - columns
            for(j=1;j<=i;j++){
                System.out.print(" Anu... ");
            }
            System.out.println();
        }
    }
     */
    
    /*
     * n to 1 decresing order
      static void printNumber(int n){
        int i,j;
        //outer loop - rows
        for(i=n;i>=1;i--){
            //inner loop - columns
            for(j=1;j<=i;j++){
                System.out.print(" Anu... ");
            }
            System.out.println();
        }
    }
     */
    static void printNumber(int n){
        int i,j;
        //outer loop - rows
        for(i=n;i>=1;i--){
            //inner loop - columns
            for(j=1;j<=i;j++){
                System.out.print(" Anu... ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printNumber(5);
            }
}
