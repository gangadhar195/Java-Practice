import java.util.*;
public class SimOfOddEven {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);

    int n = sc.nextInt();

    // int even=0;
    // int odd=0;

// for(int i=1;i<n;i++){
//     int x=sc.nextInt();
//     if(x%2==0){
//         even+=x;
//     }
//     else{
//         odd+=x;
//     }
// }
// System.out.println("Sum of Even : "+even);
// System.out.println("Sum of odd : "+odd);
        int fact =1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial is : "+fact );

    }
}
