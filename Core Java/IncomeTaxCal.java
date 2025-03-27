import java.util.*;

public class IncomeTaxCal {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Income : ");
        int n = sc.nextInt();
        int tax;

        if(n<500000){
            tax=0;
        }else if(n>500000 && n< 1000000){
            tax=(int) (n * 0.2);
        }
        else{
            tax=(int) (n * 0.1);
            
        }
        System.out.println("Your Income Tax is : "+tax);
    }
}
