import java.util.Scanner;
public class userpalindrom {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number :- ");
        int number = sc.nextInt();
          int rev =0;
          int original =number;

        while (number >0){
            int digit = number %10;
            rev = rev *10+digit;
            number = number/10; 
        }
        if (rev == original){
            System.out.print("Palidrom");
        }else {
            System.out.print("Not Palidrom");
        }
        System.out.println(rev);
        
    }
}
