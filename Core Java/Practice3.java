import java.util.*;

public class Practice3 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    int n = sc.nextInt();
    if(n>0){
        System.out.println("Number is Positive : "+n);
    }
    else{
        System.out.println("Number is Negative :"+n);
    }
   } 
}
