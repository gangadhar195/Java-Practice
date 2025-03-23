import java.util.Scanner;

public class Practics1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a =sc.nextInt();
        System.out.print("Enter B : ");
        int b =sc.nextInt();
        System.out.print("Enter C : ");
        int c =sc.nextInt();

        int averge = (a + b +c)/3;
        System.out.println("Average of 3 No : "+averge);
    }
}
