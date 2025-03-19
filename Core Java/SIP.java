import java.util.*;

public class SIP {
    public static void main(String args[]){

    Scanner sc= new Scanner(System.in);
    System.out.print("Enter Principle Amount(P) : ");
        int P = sc.nextInt();
        System.out.print("Enter Rate of Interest (R) : ");
        double R =sc.nextInt();
        System.out.print("Enter the year (Y) : ");
        double Y =sc.nextInt();

        double cal = ((P*R*Y)/100);
        System.out.println("Total Interest Amount Is : "+ cal);
    }
}
