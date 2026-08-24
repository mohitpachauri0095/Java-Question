import java.util.Scanner;
public class NegativeModuloHandling {

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        long a = sc.nextLong();
        long m = sc.nextLong();
        long ans = ((a%m)+m)%m;
        System.out.println(ans);
        sc.close();
    }
    
}
