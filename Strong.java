import java.util.*;
public class Strong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            int prod=1;
            while(rem>0){
                prod=prod*rem;
                rem=rem-1;
            }
            sum=sum+prod;
            num=num/10;
        }
        System.out.println(sum==temp?"It is strong":"It is not strong");
    }
}
