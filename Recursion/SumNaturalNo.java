package Recursion;

public class SumNaturalNo {
    public static int SumOfNatural(int n){
        // int sum =0;
        if(n==0){
            return 0;
        }else{
            //  sum+=n+SumOfNatural(n-1);
            //  return sum;
            return n + SumOfNatural(n-1);
        }
    }
    public static void main(String args[]){
        int n=10;
        int sum = SumOfNatural(3);
        System.out.println("Sum of "+n+" Natural No is : "+sum);
    }
}
