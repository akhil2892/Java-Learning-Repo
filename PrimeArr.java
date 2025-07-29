import java.util.*;
public class PrimeArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int n=arr[i];
            int cnt=0;
            for(int j=1;j<=n;j++){
                if(n%j==0){
                    cnt++;
                }
            }
            if(cnt==2){
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}
