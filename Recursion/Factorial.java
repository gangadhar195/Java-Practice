package Recursion;

public class Factorial {
    public static int Fact(int n){
        // if(n==0){
        //     return 1;
        // }else{
        //     return n * Fact(n-1);
        // }

        if(n>0){
            return n * Fact(n-1);
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        int result = Fact(5);
        System.out.println("Factorial is : "+result);
    } 
}
