import java.util.*;
public class EvenOdd{
    public static void main(String args[]){
        //even odd code
        // int i =10;
        // while(i<=98){
        //     System.out.print(i+" ");
        //     i=i+2;
       
        // }
        //find greater no between two numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value No1 : ");
        int n1=sc.nextInt();
        System.out.print("Enter Value No2 : ");
        int n2=sc.nextInt();

        if(n1>n2){
            System.out.println( "No1 is greater "+n1);
        }
        else{
            System.out.println("No2 is greater "+n2);
        }
    }
}