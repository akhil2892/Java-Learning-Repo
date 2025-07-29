/*This java program will sort the elements in array
(all numbers except 0 will be left side and 0's will be right side)  */
import java.util.*;
public class SimpleSortArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int temp=0;
        int[] arr = new int[size];
        int[] arr1=new int[size];
        System.out.println("Enter the elements of the array:"); 
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                arr1[temp]=arr[i];
                temp++;
            }
        }
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                arr1[temp++]=0;
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<size;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
