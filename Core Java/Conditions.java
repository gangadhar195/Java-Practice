import java.util.Scanner;

public class Conditions {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= 10;
        int b=++a;
        int c =a++;
        //  c += a;
        b+=c;
        //  a+=b;
        System.out.println( "A is : "+a);
        System.out.println( "B is : "+b);
        System.out.println( "C is : "+c);
        if(a>b){
            if(a>c){
                System.out.println("A is greater : "+a);
            }
            else{
                System.out.println("C is Greater : "+c);
            }
        }
        else{
            if(b>c){
                System.out.println("B is Greater : "+b);
            }
            else{
                System.out.println("C is Greater : "+c);
            }
        }

        
    }
}