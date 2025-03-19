import java.util.Scanner;

public class PrimeNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int no=sc.nextInt();
        int div=2;
        while(div<no){
            if(no%div==0){
                System.out.println("Not A Prime No ");
                
            }else{
            div = div+1;
            }
        }
            System.out.println("Prime No ");
        
    }
}
