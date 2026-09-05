public class palindromee {
    public static void main (String args []){
        int num = 121;
        int rev =0;
        int original =121;
        while (num >0) {
            int digit = num %10;
            rev = rev *10 +digit;
            num = num /10;
        }
        if (rev == original){
            System.out.println("palidrom");
        }else{
            System.out.println("Not Palidom");
        }
        System.out.print(rev);
    }
}
