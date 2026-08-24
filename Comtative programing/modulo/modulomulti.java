import java.util.Scanner;
public class modulomulti {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        long m = sc.nextLong();
        long sum =0;
        for (int i =0; i<n; i++){
            long x = sc.nextLong();
            sum = (sum + x % m) % m;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
