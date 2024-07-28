public class array_eg {
    public static void main(String[] args) {
                    //0  1  2  3  4
        int[] arr = {1, 2, 3, 4, 5,};
        String [] arr1=new String[5];
        arr1[0]="anita";
        arr1[1]="sudarshan";
        arr1[2]="vasu";
        arr1[3]="utsav";
        arr1[4]="patil";
        //to print length of string
        System.out.println(arr1.length);
        //to print all values in string
        for(int i=1;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println(arr1[0]);
        System.out.println(arr[2]);

    }   
}
