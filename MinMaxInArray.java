import java.util.*;
public class MinMaxInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0], max=arr[0];
        for(int i=0;i<size;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Minimum element is: " + min + "\nMaximum element is: " + max);
    }
}