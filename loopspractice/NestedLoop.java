import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        for (table =1; table<=5; table++){
        for (int i = 1; i <= 10; i++) {
          
            System.out.println(table + " x " + i + " = " + (table * i));
        }
    }
        sc.close();
    }
}

