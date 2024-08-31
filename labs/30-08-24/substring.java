import java.util.Scanner;

public class substring {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String s = scanner.next();
	        int start = scanner.nextInt();
	        int end = scanner.nextInt();

	        String sub = s.substring(start, end +1);

	        System.out.println(sub);

	        
	    }
	}


