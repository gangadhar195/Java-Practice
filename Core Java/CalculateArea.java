import java.util.*;

public class CalculateArea {

    // public static double Circumference(double n){
    //     return 2 * Math.PI * n;
    // }

    public static double CalculatePower(double x,double y){
        return Math.pow(x,y);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        // double n=sc.nextInt();
       
        // System.out.println("Circumference Of Cricle :"+ Circumference(n));
        // int positive = 0, negative=0,zero=0;
        // char choice;
        // do{
        // int n =sc.nextInt();

        // if(n>0){
        //     positive++;
        // }
        // else if(n<0){
        //     negative++;
        // }
        // else{
        //    zero++; 
        // }
        // System.out.print("Do you want to enter another number? (y/n): ");
        //     choice = sc.next().charAt(0);
        // } while (choice == 'y' || choice == 'Y');
        // System.out.println("Count of positive numbers: " + positive);
        // System.out.println("Count of negative numbers: " + negative);
        // System.out.println("Count of zeros: " + zero);

       

        double x=sc.nextInt();
        double y=sc.nextInt();

        double result = CalculatePower(x, y);
        System.out.println(x + " raised to the power " + y + " is: " + result);
       
    }
}
