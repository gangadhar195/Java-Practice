import java.util.Scanner;

public class Array {
    public static void PrintArray(int marks[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
    }
    public static void main(String args[]){
        int marks[] = new int[5];
        PrintArray(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println("Marks subjet "+i+" : "+marks[i]);
        }

    }
}
