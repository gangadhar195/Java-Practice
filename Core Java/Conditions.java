import java.util.Scanner;

public class Conditions {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= 10;
        int b=++a;
        int c =a++;
         c += a;
         a+=b;
        System.out.println( "A is : "+a);
        System.out.println( "B is : "+b);
        System.out.println( "C is : "+c);


    }
}