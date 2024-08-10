public class num_pattern {
    //Number patterns
    public static void main(String[] args) {
        int n = 4;
        int num = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    
}
