import java.util.Scanner;

public class PrimeNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int no=sc.nextInt();
        // int div=2;
        // //prime no 1
        // while(div<no){
        //     if(no%div==0){
        //         System.out.println("Not A Prime No ");
                
        //     }else{
        //     div = div+1;
        //     }
        // }
        //     System.out.println("Prime No ");

        //prime no 2
        boolean Prime = true;
        if(no==2){
            System.out.println("Prime No ");

        }
        else{
            for(int i=2;i<Math.sqrt(no);i++){
                if(no%i==0){
                    Prime=false;
                }
            }
            if(Prime==true){
                System.out.println("Prime No");
            }else{
                System.out.println("Not a Prime No");
            }
        }
        
    }
}
