public class multidi_array {
    static void print(int [][] arr){
        for(int i=0;i<arr.length;i++){ //outer loop
            for(int j=0;j<arr[i].length;j++){ //inner loop
             System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
         }
         System.out.println("-----------");
    }
    
    //addition of array
   static void add(int arr[][],int arr1[][]){
        int c[][]=new int[3][4];
        for(int i=0;i<arr.length;i++){ //outer loop
            for(int j=0;j<arr[i].length;j++){ //inner loop
                c[i][j]=arr[i][j]+arr1[i][j];
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
   }
    
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,6,7},{8,9,3,1}};//3 rows 4 columns
        int[][] arr1 = {{3,5,6,7},{1,2,9,7},{0,2,3,1}};//3 rows 4 columns

        print(arr);
        add(arr, arr1);
        
    }
}
