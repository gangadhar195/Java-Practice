public class Practice5 {
    public static void main(String args[]){

        int n=121;
        int rev=0;
        while(n>0){
            int lastDigit = n % 10;
             rev = rev * 10 + lastDigit;
            n=n/10;
        }
        if(n==rev){
            System.out.println("Palindrome: "+ rev);
        }
        else{
            System.out.println("Not Palindrome : "+n);
        }
    }
}
