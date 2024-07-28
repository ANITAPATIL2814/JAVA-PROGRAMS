public class foreach_loop {
    public static void main(String[] args) {
        //using for loop
        int[] arr1 = {1, 2, 3, 4, 5,};
        for(int i=1;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("----------------------------");
        //traverse array in reverse order
        for(int i=arr1.length-1;i>=0;i--){
            System.out.println(arr1[i]);
        }
        System.out.println("---------------------------");
        //foreach
        //for(datatype variable_name : array_name)
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
