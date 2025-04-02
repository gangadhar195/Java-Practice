public class Practice5 {
    public static int Palindrome(int n){
        int rev=0;
        while(n>0){
            int lastDigit = n % 10;
             rev = rev * 10 + lastDigit;
            n=n/10;
        }
        return rev;
    }

    public static void main(String args[]){

        int n=124;
      int re= Palindrome(n);
        if(n==re){
            System.out.println("Palindrome: "+ re);
        }
        else{
            System.out.println("Not Palindrome : "+n);
        }
    }
}
