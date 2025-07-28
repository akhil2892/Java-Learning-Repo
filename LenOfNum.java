import java.util.Scanner;
public class LenOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int len=0;
        while(num>0){
            len=len+1;
            num=num/10;
        }
        System.out.println("The length of the number is: " + len);
    }

}