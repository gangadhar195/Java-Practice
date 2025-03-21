import java.util.Scanner;

public class AreaCircle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Circle radius : ");
        int r = sc.nextInt();

        double area =3.14 * r *r;
        System.out.println("Area of circlr : "+area);
    }
}
