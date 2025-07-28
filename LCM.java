/*lcm can be easily calculated using gcd code i.e mulplying 
two numbers and dividing by gcd gives lcm.*/
import java.util.*;
public class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find LCM:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int gcd=1;
        for(int i=1;i<=num1;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        System.out.println("LCM of "+num1+" and "+num2+" is: "+num1*num2/gcd);
    }
}
