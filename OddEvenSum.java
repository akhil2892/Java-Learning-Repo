//This is a Java program to calculate the sum of odd and even digits of a number
import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int oddsum=0;
        int evensum=0;
        while(num>0){
            int rem=num%10; // Get the last digit
            if(rem%2==0){
                evensum=evensum+rem;
            }
            else{
                oddsum=oddsum+rem;
            }
            num=num/10; // Remove the last digit
        }
        System.out.println("Sum of even digits: " + evensum);
        System.out.println("Sum of odd digits: " + oddsum);
        System.out.println(evensum>oddsum?"Even is greater":"Odd is greater");
    }
    
}
