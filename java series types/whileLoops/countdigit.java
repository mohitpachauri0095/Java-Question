
// import java.util.*;
public class countdigit {
    public static void main(String args []){
        // Scanner sc = new Scanner (System.in);
        int number =12345;
        int count = 1;
        while (number >0){
            number = number /10;
            count++;
        }
        System.out.println(count);

    }
    
}
