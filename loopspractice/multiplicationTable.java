import java.util.Scanner;
public class multiplicationTable {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number = ");
        int number = sc.nextInt();
        for (int i = 1; i<=10; i++){
            // number = number *i;
            System.out.println(number * i);
        }
        sc.close();
    }
    
}
