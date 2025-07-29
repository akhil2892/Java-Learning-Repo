/*This java code is to find the product of all odd and even indexed elements in an array.
and Print which product is greater.*/
import java.util.*;
public class OddEvenProdArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int oddprod=1;
        int evenprod=1;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                evenprod=evenprod*arr[i];
            }else{
                oddprod=oddprod*arr[i];
            }
        }
        System.out.println("Odd Product is "+oddprod+"\nEven Product is "+evenprod);
        System.out.println(evenprod>oddprod ? "Even Product is greater" : "Odd Product is greater");
    }
    
}
