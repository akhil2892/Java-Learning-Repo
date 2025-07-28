import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int temp=num; // Store the original number for later comparison
        int rev=0;
        int rem=0;
        while(num>0){
          rem=num%10;
          rev=rev*10+rem;
          num=num/10;
        }
        System.out.println(temp==rev?"The number is a palindrome.":"The number is not a palindrome.");
    }
}

