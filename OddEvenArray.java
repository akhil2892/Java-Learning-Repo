import java.util.*;
public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+ " is a even number");
            } else {
                System.out.println(arr[i]+ " is a odd number");
            }
        }
    }
}
