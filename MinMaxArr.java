//This java code used to find the minimum and maximum element in an array.
import java.util.Scanner;
public class MinMaxArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size= sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int min=arr[0], max=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Minimum element: " + min+ "\nMaximum element: " + max);
    }
}
