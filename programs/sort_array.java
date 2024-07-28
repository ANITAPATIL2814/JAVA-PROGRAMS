public class sort_array {
    /* 
    public static void main(String[] args) {
        //original array
        int[] numbers = {5, 2, 8, 1, 9,3,1,4,7,5};
        System.out.println("orginal array");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]+" ");
        }
        //sorting in asc order array
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
        System.out.println("--------------------------");
        System.out.println("sorted asc order array");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    */
    public static void main(String[] args) {
        //original array
        int[] numbers = {5, 2, 8, 1, 9,3,1,4,7,5};
        System.out.println("orginal array");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]+" ");
        }
        //sorting in desc order array
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]<numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
        System.out.println("--------------------------");
        System.out.println("sorted desc order array");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
