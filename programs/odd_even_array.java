public class odd_even_array {
    static void calcOdd(int[]mycount){
        for(int i=0;i<mycount.length;i++){
            if(mycount[i]%2!=0){
                System.out.println(mycount[i]);
            }
        }
    }
    static void calEven(int[]mycount){
        for(int i=0;i<mycount.length;i++){
            if(mycount[i]%2==0){
                System.out.println(mycount[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] mycount = {5, 2, 8, 1, 9,3,4,7,5};
        System.out.println("odd element : ");
        calcOdd(mycount);
        System.out.println("evem element :");
        calEven(mycount);    
    }
}
