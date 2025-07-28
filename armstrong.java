import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int temp =num;
        int temp2=num;
        int len=0;
        int rem=0;
        int sum=0;
        while(num>0){
            len=len+1;
            num=num/10;
        }
        while(temp>0){
            rem=temp%10;
            sum=sum+(int)Math.pow(rem,len);
            temp=temp/10;
        }
        System.out.println(sum==temp2?"It is armstrong":"It is not armstrong");

    }
}
