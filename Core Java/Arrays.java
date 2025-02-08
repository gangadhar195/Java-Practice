import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){
    //    int marks[] = {88,90,95};
    //    for(int i=0;i<marks.length;i++){
    //     System.out.println(marks[i]);
    //    }

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array : ");
    int n=sc.nextInt();
    int number[] = new int[n];
    System.out.println("Enter The Array Element : ");

    for(int i=0;i<n;i++){
         number[i] =sc.nextInt();
    }

    System.out.println("Enter the Found Element in Array : ");
    int x = sc.nextInt();

    for(int i=0;i<number.length;i++){
        if(number[i]==x){
            System.out.println("No Found At Index "+ i);
        }
    }


    }
}
