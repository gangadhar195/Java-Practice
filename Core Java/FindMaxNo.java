import java.util.*;

public class FindMaxNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a=sc.nextInt();
        System.out.print("Enter B : ");
        int b=sc.nextInt();
        System.out.print("Enter C : ");
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("A is greater " + a);
            }
            else{
                System.out.println("C is greater " +c);
            }
        }
        else {
            if(b>c){
                System.out.println("B is Greater "+ b);
            }
            else{
                System.out.println("C is greater " +c);
            }
        }
    }
}
