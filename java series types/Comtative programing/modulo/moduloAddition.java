import java.util.Scanner;
public class moduloAddition {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long m = sc.nextLong();

        long result = ((a % m) + (b % m)) % m;
        System.out.println(result);
        sc.close();
    }
    
}
