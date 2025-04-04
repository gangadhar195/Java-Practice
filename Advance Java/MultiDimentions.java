import java.util.Scanner;

public class MultiDimentions {
    public static void main(String args[]){
        // int arr[][] = new int[3][3];
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter rows : ");
        r=sc.nextInt();
        System.out.print("enter cols : ");
        c=sc.nextInt();
          int  arr[][] = new int[r][c];
          

          for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
