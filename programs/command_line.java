import java.util.Scanner;

public class command_line {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]+" ");
            /*
             * op:
             * PS E:\java_class_it_vedant> java command_line anita patil  
                anita 
                patil
             */
        }
    }
}
