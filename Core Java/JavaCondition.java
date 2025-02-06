import java.util.Scanner;

public class JavaCondition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Even or Odd
        // int x = sc.nextInt();
        // if(x%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }

        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("A and B both are Equal");
        }
        else if(a > b){
            System.out.println("A is Greater Than B");
        }
        else{
            System.out.println("B is Greater Than A");
        }

    }
}
