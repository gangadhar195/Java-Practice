import java.util.Scanner;

public class PrintNatureNo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.err.println("Addition of Nature No :");
        int sum =0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        // //table of input no
        // int n=sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.out.println(i*n);
        // }
    }
}
