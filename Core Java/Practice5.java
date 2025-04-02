public class Practice5 {
    // public static int Palindrome(int n){
    //     int rev=0;
    //     while(n>0){
    //         int lastDigit = n % 10;
    //          rev = rev * 10 + lastDigit;
    //         n=n/10;
    //     }
    //     return rev;
    // }

//     public static int Factorial(int n){
//         int fact=1;
//         for(int i=1;i<=n;i++){
//              fact = fact * i;

//         }
//         return fact;
//     }
//     public static int binCoeff(int n,int r){
//     int n_fact =Factorial(n);
//     int r_fact =Factorial(r);
//     int rcn_fact =Factorial(n-r);

//     int biocoff = n_fact/(r_fact*rcn_fact);
//     return biocoff;
// }

// public static int average(int a,int b,int c){
//    int avg = a+b+c/3;
//     return avg;
// }
    public static boolean isPrime(int n){
        if(n%2==0){
            return true;
        }
    return false;
    }
public static void main(String args[]){

    //     int n=124;
    //   int re= Palindrome(n);
    //     if(n==re){
    //         System.out.println("Palindrome: "+ re);
    //     }
    //     else{
    //         System.out.println("Not Palindrome : "+n);
    //     }

    //Question 2
    //    int result=  binCoeff(5, 2);

    // System.out.println("Bin Coeff : "+ result);

    //Question 1 Average
//    int avg= average(2,3,5);
//    System.out.println("Average of three Number is : "+avg);

//is Prime or Not 
    boolean isPrimeN = isPrime(8);
    if(isPrimeN){
        System.out.println("Even : "+isPrimeN);
    }
    else{
        System.out.println("Not Even");
    }

    }
}
