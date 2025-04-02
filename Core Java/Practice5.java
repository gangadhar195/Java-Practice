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

    public static int Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
             fact = fact * i;

        }
        return fact;
    }
    public static int binCoeff(int n,int r){
    int n_fact =Factorial(n);
    int r_fact =Factorial(r);
    int rcn_fact =Factorial(n-r);

    int biocoff = n_fact/(r_fact*rcn_fact);
    return biocoff;
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
       int result=  binCoeff(5, 2);

    System.out.println("Bin Coeff : "+ result);
    }
}
