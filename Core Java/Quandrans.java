import java.util.*;

public class Quandrans{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x values : ");
        int x=sc.nextInt();
        System.out.print("Enter Y values : ");
        int y=sc.nextInt();

        if(x>0){
            if(y>0){
                System.out.println("Quandran 1");
            }
            else{
                System.out.println("Quandran 4");

            }
        }
        else{
            if(y>0){
                System.out.println("Quandran 2");

            }
            else{
                System.out.println("Quandran 3");

            }
        }
        sc.close();
    }
    
}