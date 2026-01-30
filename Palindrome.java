import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
        int org = n;
        int rev =0;
        while(n!=0){
            int d = n%10;
            rev = rev*10+d;
            n = n/10;
        }
        if(org == rev){
            System.out.println("yes");
        }
        else{
            System.out.println("no");

        }
    }
}
