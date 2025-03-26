import java.util.*;

public class Practice3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Question one
        // System.out.print("Enter a Number : ");
        // int n = sc.nextInt();
        // if(n>0){
        // System.out.println("Number is Positive : "+n);
        // }
        // else{
        // System.out.println("Number is Negative :"+n);
        // }

        // Question Two
        // double temp = 103.5;

        // if(temp>100){
        // System.out.println("You have a fever");
        // }
        // else{
        // System.out.println("You don't have fever");
        // }

        // Question Three
        // System.out.print("Enter the Week Number : ");
        // int w = sc.nextInt();

        // switch (w) {
        // case 1:
        // System.out.println("Sunday");
        // break;
        // case 2:
        // System.out.println("Monday");
        // break;
        // case 3:
        // System.out.println("Tuesday");
        // break;
        // case 4:
        // System.out.println("Wednesday");
        // break;
        // case 5:
        // System.out.println("Thursday");
        // break;
        // case 6:
        // System.out.println("Freiday");
        // break;
        // case 7:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("Invalid Input");
        // }

        // Question Four
        // int a=63, b=36;
        // boolean x = (a<b)?true:false;
        // int y=(a>b)?a:b;
        // System.out.println("X value is : "+x);
        // System.out.println("Y value is : "+y);

        // Question five
        System.out.print("Enter the Year : ");
        int year = sc.nextInt();

        if (year / 4 == 0) {
            if (year / 100 == 0) {

                if (year / 400 == 0) {
                    System.out.println("year is leap year");
                }else {
                    System.out.println("year is not leap year");
        
                }
            }else {
                System.out.println("year is not leap year");
    
            }
        } else {
            System.out.println("year is not leap year");

        }

    }
}
