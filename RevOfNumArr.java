import java.util.*;
public class RevOfNumArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of the Array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reversed Array:");
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
