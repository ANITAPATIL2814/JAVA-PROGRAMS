import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {
        /*Scanner sc= new Scanner(System.in);
        System.out.println("enter know programming or not Y/N :");
        String check=sc.next();
        //equals : comparison person , will not check case 
        //equalsIgnoreCase : it does not check uppercase to lowercase
        if(check.equalsIgnoreCase("yes")){  //outer
            System.out.println(" what lang u know development/testing/desiging");
            String lang=sc.next();
                if(lang.equalsIgnoreCase("development" )) 
                {
                    System.out.println(" Yes i knows  devlopment");
                }
                else if(lang.equalsIgnoreCase("testing" )) 
                {
                    System.out.println(" Yes i knows testing");
                }
                else if(lang.equalsIgnoreCase("desiging" )) 
                {
                    System.out.println(" Yes i knows  desiging");
                }
                else{
                    System.out.println(" i dont know any lang");
                }
        }
        else{
            System.out.println("not know programming lang");
        }
            */
            //nested if
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter present or Absent");
            String status=sc.next();
            if(status.equalsIgnoreCase("present")){
                System.out.println("enter your score 1- 100");
                int score=sc.nextInt();
                if(score<100 && score >=80){
                    System.out.println("PASS : O+");
                }
                else if(score<80 && score >=70){
                    System.out.println("PASS : A+");
                }
                else if(score<70 && score >=60){
                    System.out.println("PASS : A");
                }
                else if(score<60 && score >=50){
                    System.out.println("PASS : B");
                }
                else if(score<50 && score >=40){
                    System.out.println("PASS : C");
                }
                else if(score<40 && score >=35){
                    System.out.println("PASS : D");
                }
                else if(score < 30 && score<=1){
                    System.out.println("Fail");
                }
                else {
                    System.out.println("Invalid score");
                }
            }
            else{
                System.out.println("Fail , u r absent ,  attempt kt exam");
            }
    }
}
