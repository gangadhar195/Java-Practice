import java.util.Scanner;

public class JavaFunction {
    public static int Calculator(int a,int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int mul = Calculator(a,b);

            System.out.println("Multiplication A and B :" + mul);
        
        
    }
}
