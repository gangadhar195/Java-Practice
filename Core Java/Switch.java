import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int button = sc.nextInt();
        // switch (button) {
        //      case 1:
        //         System.out.println("Hello");
        //         break;
        //     case 2:
        //         System.out.println("Namsate");
        //         break;
        //     case 3:
        //         System.out.println("bonjuor");
        //         break;
        
        //     default:
        //         System.out.println("Invalid Input ");
        //         break;
        // }

        int a= sc.nextInt();
        int b=sc.nextInt();
       
        System.out.println("\n1.Add\n2.Sub\n3.Mul\n4.Division\n5.Exit");
        int no=sc.nextInt();
        switch(no){
            case 1:
                    int sum = a+b;
                    System.out.println("Sum :"+sum);
                break;
            case 2:
                    int sub = a-b;
                    System.out.println("Sub :"+sub);
                break;
            case 3:
                    int mul = a*b;
                    System.out.println("Sum :"+ mul);
                break;
            case 4:
                    int div = a/b;
                    System.out.println("Sum :"+div);
                break;
           case 5:
                    System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
