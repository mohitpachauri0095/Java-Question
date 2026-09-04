public class Palindrome {
    public static void main (String args []){
        int number = 12345;
        int rev = 0;
        int original = 12345;
        while(number >0){
            int digit = number %10;
            rev = rev *10+digit;
            number = number /10;
        }
            if (rev == original){
                System.out.println("palindrome");
            }else {
                System.out.println("Not Palindrome");
            }
        
        System.out.println(rev);
    }
}
