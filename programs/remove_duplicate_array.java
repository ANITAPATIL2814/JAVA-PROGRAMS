public class remove_duplicate_array {
    public static void main(String[] args) {
        //remove duplicate in array 
        int[] arr = {1, 1,2, 2, 3, 4, 5};
        //without using predefined function
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){ //check duplicates
                if(arr[i]==arr[j]){
                    System.out.println("duplicate element"+arr[j]);
                }
            }
        }
        
    }
}
